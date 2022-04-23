package ru.maksoap.core.stack

import ru.maksoap.core.constants.Constants

data class Prefix(
    val name: String,
    var prefix: String = "",
    var postfix: String = "",
    var maxAmount: Long = -1,
    val tags: List<TagData> = emptyList()
) {

    fun item(material: Material): PrefixMaterialItem =
        PrefixMaterialItem(this, material)

    fun stack(material: Material, amount: Long): ItemStack =
        ItemStack(item(material), amount.toInt())

    companion object {

        val dustTiny    = Prefix("dustTiny", "Tiny pile of ", " dust", Constants.U9, listOf(TagData.dust))
        val dustSmall   = Prefix("dustSmall", "Small pile of ", " dust", Constants.U4, listOf(TagData.dust))
        val dust        = Prefix("dust", "", " dust", Constants.U, listOf(TagData.dust))
        val gem         = Prefix("gem", maxAmount = Constants.U, tags = listOf(TagData.gem))
        val ingot       = Prefix("ingot", "", " ingot", Constants.U, listOf(TagData.ingot))
        val nugget      = Prefix("nugget", "", " nugget", Constants.U9, listOf(TagData.ingot))
        val item        = Prefix("item", maxAmount = Constants.U)
    }
}