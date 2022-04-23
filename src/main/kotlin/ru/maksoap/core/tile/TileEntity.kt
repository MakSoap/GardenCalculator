package ru.maksoap.core.tile

import ru.maksoap.core.world.Field
import ru.maksoap.core.world.Position

interface TileEntity {

    var position: Position
    var field: Field
    val name: String

    fun update()

    fun copy(): TileEntity
}