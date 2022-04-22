package ru.maksoap.core.biome

import java.util.*

object FarmBonusConfig {

    private val humidityBiomeTypeBonus: MutableMap<Type, Int> = EnumMap(Type::class.java)
    private val nutrientBiomeTypeBonus: MutableMap<Type, Int> = EnumMap(Type::class.java)

    fun addNutrients(nutrientsMap: Map<Type, Int>) {
        nutrientsMap.forEach(::addBiomeNutrientsBonus)
    }

    fun applyNutrients(nutrientsMap: Map<Type, Int>) {
        nutrientBiomeTypeBonus.clear()
        addNutrients(nutrientsMap)
    }

    fun addHumidity(humidityMap: Map<Type, Int>) {
        humidityMap.forEach(::addBiomeHumidityBonus)
    }

    fun applyHumidity(humidityMap: Map<Type, Int>) {
        humidityBiomeTypeBonus.clear()
        addHumidity(humidityMap)
    }

    fun getHumidityBiomeBonus(biome: Biome): Int =
        biome.types.maxOf { humidityBiomeTypeBonus[it] ?: 0 }

    fun getNutrientBiomeBonus(biome: Biome): Int =
        biome.types.maxOf { nutrientBiomeTypeBonus[it] ?: 0 }

    fun addBiomeNutrientsBonus(biomeType: Type, value: Int) {
        nutrientBiomeTypeBonus[biomeType] = value
    }

    fun addBiomeHumidityBonus(biomeType: Type, value: Int) {
        humidityBiomeTypeBonus[biomeType] = value
    }

    init {
        applyNutrients(FarmBonusData.standardIC2NutrientsBonus)
    }
}

object FarmBonusData {

    val standardIC2NutrientsBonus: Map<Type, Int> = mapOf(
        Type.JUNGLE     to 10,
        Type.SWAMP      to 10,
        Type.MUSHROOM   to 5,
        Type.FOREST     to 5,
        Type.RIVER      to 2,
        Type.PLAINS     to 0,
        Type.SAVANNA    to -2,
        Type.HILLS      to -5,
        Type.MOUNTAIN   to -5,
        Type.WASTELAND  to -8,
        Type.END        to -10,
        Type.NETHER     to -10,
        Type.DEAD       to -10,
    )

    val GTNHBonus: Map<Type, Int> = mapOf(
        Type.HOT            to -5,
        Type.COLD           to -5,
        Type.SPARSE         to -5,
        Type.WET            to 10,
        Type.DRY            to -10,
        Type.SAVANNA        to -5,
        Type.CONIFEROUS     to 7,
        Type.JUNGLE         to 10,
        Type.SPOOKY         to 7,
        Type.DEAD           to -5,
        Type.LUSH           to 7,
        Type.NETHER         to -10,
        Type.END            to -10,
        Type.MUSHROOM       to 8,
        Type.MAGICAL        to 6,
        Type.OCEAN          to 10,
        Type.RIVER          to 9,
        Type.WATER          to 10,
        Type.MESA           to -5,
        Type.FOREST         to 6,
        Type.PLAINS         to 0,
        Type.MOUNTAIN       to 5,
        Type.HILLS          to 4,
        Type.SWAMP          to 10,
        Type.SANDY          to -5,
        Type.SNOWY          to -5,
        Type.WASTELAND      to -5,
        Type.BEACH          to 6
    )

    val IIAHumidityBonus: Map<Type, Int> = mapOf(
        Type.JUNGLE to 7,
        Type.SWAMP to 10,
        Type.MUSHROOM to 5,
        Type.FOREST to 5,
        Type.RIVER to 10,
        Type.PLAINS to 2 //,
//        Type.SAVANNA to -2,
//        Type.HILLS to -5,
//        Type.MOUNTAIN to -5,
//        Type.WASTELAND to -8,
//        Type.DESERT to -10,
//        Type.END to -10,
//        Type.NETHER to -10,
//        Type.DEAD to -10)
    )
}