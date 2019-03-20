import java.util.*
import kotlin.Comparator

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> { 
        override fun compare(o1: Int?, o2: Int?): Int = Collections.reverseOrder<Int>().compare(o1, o2)
    })
    return arrayList
}
