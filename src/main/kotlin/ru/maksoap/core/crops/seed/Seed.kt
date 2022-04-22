package ru.maksoap.core.crops.seed

import ru.maksoap.core.crops.Crop

interface Seed {
    var crop: Crop
    var growth: Byte
    var gain: Byte
    var resistance: Byte

    fun copy(): Seed
}