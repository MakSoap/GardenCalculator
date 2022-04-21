package ru.maksoap.core.time

import java.util.*
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicLong

class Tick(ticks: Number = 0) : Cloneable {

    private val ticks: AtomicLong

    fun incAndGet(): Long = ticks.incrementAndGet()

    fun getAndInc(): Long = ticks.getAndIncrement()

    fun get(): Long = ticks.get()

    fun withDays(days: Long): Tick = apply { ticks.addAndGet(days * TICKS_IN_DAYS) }

    fun withHours(hours: Long): Tick = apply { ticks.addAndGet(hours * TICKS_IN_HOURS) }

    fun withMinutes(minutes: Long): Tick = apply { ticks.addAndGet(minutes * TICKS_IN_MINUTES) }

    fun withSecond(second: Long): Tick = apply { ticks.addAndGet(second * TICKS_IN_SECOND) }

    fun withTicks(ticks: Tick): Tick = apply { this.ticks.addAndGet(ticks.get()) }

    fun toMillis(): Long = get() * TICKS_TO_MILLIS

    fun toDays(): Long = TimeUnit.MILLISECONDS.toDays(toMillis())

    fun toHours(): Long = TimeUnit.MILLISECONDS.toHours(toMillis())

    fun toMinutes(): Long = TimeUnit.MILLISECONDS.toMinutes(toMillis())

    fun toSeconds(): Long = TimeUnit.MILLISECONDS.toSeconds(toMillis())

    val days: Long
        get() = getTime(toMillis(), TimeUnit.DAYS)
    val hours: Long
        get() = getTime(toMillis(), TimeUnit.HOURS)
    val minutes: Long
        get() = getTime(toMillis(), TimeUnit.MINUTES)
    val seconds: Long
        get() = getTime(toMillis(), TimeUnit.SECONDS)

    private fun getTime(millisecond: Long, timeUnit: TimeUnit): Long {
        return when (timeUnit) {
            TimeUnit.DAYS -> millisecond / TimeUnit.DAYS.toMillis(1)
            TimeUnit.HOURS -> millisecond / TimeUnit.HOURS.toMillis(1) % HOURS_IN_DAYS
            TimeUnit.MINUTES -> millisecond / TimeUnit.MINUTES.toMillis(1) % MINUTES_IN_HOURS
            TimeUnit.SECONDS -> millisecond / TimeUnit.SECONDS.toMillis(1) % SECONDS_IN_MINUTES
            else -> throw IllegalArgumentException("$timeUnit not supported!")
        }
    }

    private fun getTimeAndName(millisecond: Long, timeUnit: TimeUnit): String {
        Objects.requireNonNull(timeUnit)
        val fieldNames: List<Array<String>> = listOf(
            arrayOf("день", "дня", "дней"),
            arrayOf("минута", "минуты", "минут"),
            arrayOf("секунда", "секунды", "секунд")
        )

        return if (timeUnit.ordinal >= TimeUnit.SECONDS.ordinal && timeUnit.ordinal <= TimeUnit.DAYS.ordinal) {
            val days = getTime(millisecond, timeUnit)
            val names = fieldNames[6 - timeUnit.ordinal]
            if (days % 100 !in 5..20) {
                if (days % 10 == 1L) return days.toString() + " " + names[0]
                if (days % 10 in 2..4) return days.toString() + " " + names[1]
            }
            days.toString() + " " + names[2]
        } else throw IllegalArgumentException("$timeUnit not supported!")
    }

    fun between(anotherTick: Tick): Tick {
        if (anotherTick.get() == get()) return Tick()
        return if (anotherTick.get() > get())
            anotherTick.copy().withSecond(-toSeconds())
        else
            copy().withSecond(-anotherTick.toSeconds())
    }

    fun asString(): String {
        val builder = StringBuilder()
        if (toDays() != 0L) {
            builder.append(getTimeAndName(toMillis(), TimeUnit.DAYS)).append(" ")
        }
        if (toHours() != 0L) {
            builder.append(getTimeAndName(toMillis(), TimeUnit.HOURS)).append(" ")
        }
        if (toMinutes() != 0L) {
            builder.append(getTimeAndName(toMillis(), TimeUnit.MINUTES)).append(" ")
        }
        if (toSeconds() != 0L) {
            builder.append(getTimeAndName(toMillis(), TimeUnit.SECONDS)).append(" ")
        }
        return builder.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Tick

        if (ticks.get() != other.ticks.get()) return false

        return true
    }

    override fun hashCode(): Int = ticks.get().hashCode()

    override fun toString(): String = "Tick{${asString()}}"

    fun copy(): Tick = Tick(ticks)

    companion object {
        private const val TICKS_TO_MILLIS: Long = 50
        private const val TICKS_IN_SECOND: Long = 20
        private const val SECONDS_IN_MINUTES: Long = 60
        private const val TICKS_IN_MINUTES: Long = SECONDS_IN_MINUTES * TICKS_IN_SECOND //1200
        private const val MINUTES_IN_HOURS: Long = 60
        private const val TICKS_IN_HOURS: Long = MINUTES_IN_HOURS * TICKS_IN_MINUTES //72000
        private const val HOURS_IN_DAYS: Long = 24
        private const val TICKS_IN_DAYS: Long = HOURS_IN_DAYS * TICKS_IN_HOURS //1728000

        fun ofSeconds(seconds: Number): Tick = Tick(seconds.toLong() * TICKS_IN_SECOND)
        fun ofMinutes(minutes: Number): Tick = Tick(minutes.toLong() * TICKS_IN_MINUTES)
        fun ofHours(hours: Number): Tick = Tick(hours.toLong() * TICKS_IN_HOURS)
    }

    init {
        require(ticks.toLong() >= 0) { "Ticks must not be less zero or null!" }
        this.ticks = AtomicLong(ticks.toLong())
    }
}