
import java.time.LocalDate.*
import java.util.Date

data class date(var year: Int = now().year, var month: Int = now().monthValue, var day: Int = now().dayOfMonth): Comparable<date>{
    override fun compareTo(other: date): Int {
        return compareValuesBy(this,other,date::year,date::month,date::day)
    }

}

class DateMonthComparator : Comparator<date> {
    override fun compare(a: date, b: date): Int {
        return compareValuesBy(a, b, date::month, date::day, date::year)
    }
}
