package ru.maksoap.core.extention

fun <T> T.requireLimit(minimumValue: T, maximumValue: T): T where T: Number, T: Comparable<T>{
    if (minimumValue <= maximumValue && this in minimumValue..maximumValue) return this
    throw IllegalArgumentException("Value out of range: maximum $maximumValue, minimum $minimumValue.")
}

fun String?.center(size: Int, pad: Char = ' '): String? {
    if (this == null || size <= this.length) return this
    val sb = StringBuilder(size)
    for (i in 0 until (size - this.length) / 2) {
        sb.append(pad)
    }
    sb.append(this)
    while (sb.length < size) {
        sb.append(pad)
    }
    return sb.toString()
}