package ru.maksoap.core.world

data class Position(var x: Int, var y: Int) : Comparable<Position> {

    fun up(): Position          = Position(x, y + 1)
    fun upLeft(): Position      = Position(x - 1, y + 1)
    fun upRight(): Position     = Position(x + 1, y + 1)
    fun back(): Position        = Position(x, y - 1)
    fun backLeft(): Position    = Position(x - 1, y - 1)
    fun backRight(): Position   = Position(x + 1, y - 1)
    fun left(): Position        = Position(x - 1, y)
    fun right(): Position       = Position(x + 1, y)

    fun setPosition(_x: Int, _y: Int) {
        x = _x
        y = _y
    }

    fun setPosition(pos: Position) {
        x = pos.x
        y = pos.y
    }

    override fun compareTo(other: Position): Int =
        Comparator.comparing(Position::x).thenComparing(Position::y).compare(this, other)

    fun copy() = Position(x, y)
}