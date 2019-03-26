data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(obj: MyDate): Int = when {
        year != obj.year -> year - obj.year
        month != obj.month -> month - obj.month
        else -> dayOfMonth - obj.dayOfMonth
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
