package ru.maksoap.core.world

import ru.maksoap.core.extention.center
import ru.maksoap.core.tile.TileEntity
import kotlin.math.absoluteValue
import kotlin.math.max

class FieldController(val field: Field) {

    fun fieldToString(): String {
        val sortedMap = field.loadedEntity.toSortedMap(Position::compareTo)
        val minPos = sortedMap.takeIf { it.isNotEmpty() } ?.firstKey() ?: Position(0, 0)
        val maxPos = sortedMap.takeIf { it.isNotEmpty() } ?.lastKey() ?: Position(0, 0)

        val entities = Array<Array<TileEntity?>>(max(minPos.x.absoluteValue + maxPos.x, field.width)) {
            Array(max(minPos.y.absoluteValue + maxPos.y, field.height)) { null }
        }

        var maxNameLength = 4
        sortedMap.forEach { (pos, entity) ->
            maxNameLength = max(maxNameLength, entity?.name?.length ?: 0)
            entities[minPos.x.absoluteValue + pos.x][minPos.y.absoluteValue + pos.y] = entity
        }

        val buffer = StringBuffer()
        entities.forEach { array ->
            array.forEach { tileEntity ->
                buffer.append("[")
                buffer.append(tileEntity?.name.center(maxNameLength))
                buffer.append("]")
            }
            buffer.append(System.lineSeparator())
        }
        return buffer.toString()
    }

    fun updateAll() {
        field.loadedEntity.values.forEach { it?.update() }
    }
}