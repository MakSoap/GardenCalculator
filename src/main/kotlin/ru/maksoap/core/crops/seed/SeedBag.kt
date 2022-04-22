package ru.maksoap.core.crops.seed

import ru.maksoap.core.crops.Crop

data class SeedBag(
    override var crop: Crop,
    override var growth: Byte,
    override var gain: Byte,
    override var resistance: Byte
) : Seed {
    override fun copy(): Seed = SeedBag(crop, growth, gain, resistance)
}