package ru.maksoap.core.stack

open class Item(
    val name: String,
    val localName: String
) {

    constructor(name: String) : this(name, name)

    override fun toString(): String = "Item(name='$name', localName='$localName')"

    fun copy(): Item = Item(name, localName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Item) return false

        if (name != other.name) return false
        if (localName != other.localName) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + localName.hashCode()
        return result
    }
}