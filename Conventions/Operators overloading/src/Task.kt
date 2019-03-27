import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

data class TimeIntervalWithMultiplier(val timeInterval: TimeInterval, val multiplier: Int)

operator fun TimeInterval.times(multiplier: Int): TimeIntervalWithMultiplier = TimeIntervalWithMultiplier(this, multiplier)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(timeIntervalWithMultiplier: TimeIntervalWithMultiplier): MyDate {
    val (interval, multiplier) = timeIntervalWithMultiplier
    return addTimeIntervals(interval, multiplier)
}

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
