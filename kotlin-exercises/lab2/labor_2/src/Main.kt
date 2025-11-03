import IDictionary
import date


fun monogram(name:String){
    println("Name was: $name")

    val temp = name.split(" ").map { it.first().uppercase() }.joinToString("")
    println(temp)
}
fun List<String>.join(symbol: String) = print(this.joinToString(symbol))
fun List<String>.getLongest() = this.maxOf{ it }

//problem 3

fun date.isLeapYear() = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)


fun main(){

    /*
    val dict: IDictionary = ListDictionary()
    println("Number of words: ${dict.size()}")

    var word: String?

    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict.find(it) }}")
    }
    */

   // print(date(2001,1,1).isLeapYear())

    val date1 = date(2020,1,1)
    val date2 = date(2021,1,1)

    println(date1<date2) // Comparable

    val comparator = DateMonthComparator()
    println(comparator.compare(date1,date2)) // Comparator
}