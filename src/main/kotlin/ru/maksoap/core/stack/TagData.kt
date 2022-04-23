package ru.maksoap.core.stack

class TagData private constructor(private val name: String) {

    companion object {
        val ingot: TagData  = TagData("ingot")
        val dust: TagData   = TagData("dust")
        val gem: TagData    = TagData("gem")
    }
}