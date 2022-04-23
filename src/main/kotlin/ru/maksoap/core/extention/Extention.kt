package ru.maksoap.core.extention

fun <T> T.requireLimit(minimumValue: T, maximumValue: T): T where T: Number, T: Comparable<T>{
    if (minimumValue <= maximumValue && this in minimumValue..maximumValue) return this
    throw IllegalArgumentException("Value out of range: maximum $maximumValue, minimum $minimumValue.")
}