package ru.maksoap.core.config

import java.util.*

object Config {
    val random = Random()

    var dirtBlocks: Byte = 0 // Блоки под землей. Считается блоки под грядкой. Значения от 0 до 3
    set(value) { field = value.coerceIn(0, 3) }

    var levelCropField: Short = 64 //Высота поля. Значения от 0 до 255
        set(value) { field = value.coerceIn(0, 255) }

    var isSeeSky        = false
    var isHydration     = false
    var isFertilizer    = false
    var isWeedEx        = false
    var isCropalyzer    = false
}