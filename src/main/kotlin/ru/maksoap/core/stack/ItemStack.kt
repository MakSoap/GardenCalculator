package ru.maksoap.core.stack

class ItemStack(_item: Item, val amount: Int) {

    val item: Item = _item.copy()

    override fun toString(): String = "ItemStack(amount=$amount, item=$item)"

    fun copy(): ItemStack = ItemStack(item, amount)
}