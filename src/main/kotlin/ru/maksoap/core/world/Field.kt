package ru.maksoap.core.world

import ru.maksoap.core.biome.Biome
import ru.maksoap.core.biome.BiomeData
import ru.maksoap.core.extention.requireLimit
import ru.maksoap.core.tile.TileEntity
import java.lang.IllegalArgumentException

class Field(
    width: Int,
    height: Int,
    val defaultBiome: Biome = Biome.biomeByName(BiomeData.plains) ?: throw IllegalArgumentException("Биома 'plains (равнины)' не существует")
) {

    val width: Int = width.requireLimit(1, 11)
    val height: Int = height.requireLimit(1, 11)

    val loadedEntity: MutableMap<Position, TileEntity?> = hashMapOf()
    val biomeOnPosition: MutableMap<Position, Biome?> = hashMapOf()

    fun copy(): Field = Field(width, height, defaultBiome).also { field ->
        loadedEntity.forEach { (t, u) -> loadedEntity[t.copy()] = u?.copy()?.also { it.field = field } }
        biomeOnPosition.forEach { (t, u) -> biomeOnPosition[t.copy()] = u }
    }
}