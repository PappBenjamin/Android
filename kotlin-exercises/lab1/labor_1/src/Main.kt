import kotlin.math.sqrt
import kotlin.uuid.Uuid.Companion.random

//1
fun sum(a: Int, b: Int): String {return "$a + $b = ${a+b}"} // nem kell val, var


//2
fun daysOfWeek(): Unit {
    val days = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")

    for(it in days){println(it)} // a

    val listed = days.filter{it.startsWith("T")} //b
    for(it in listed){println(it)}
}

//3
fun isPrime(a:Int): Boolean{

    val sqrtA = sqrt(a.toDouble()).toInt()

    for(i in 2..sqrtA){
        if(a.toDouble() % i == 0.0){
            return false
        }
    }

    return true
}
fun printPrimes(a:Int):Unit{
    for(it in 2..a){
        if(isPrime(it)){
            println(it)}
    }
}

//4
fun encodeMsg(msg:String,key:Int):MutableList<Int>{

    val strToInt = mutableListOf<Int>()

    for(char in msg){
        strToInt.add(char.code + key)
    }

    return strToInt
}
fun decodeMsg(msg:MutableList<Int>, key: Int){
    msg.forEach { print((it - key).toChar()) }
}

//5
fun even(list:List<Int>) = list.forEach{if(it % 2 == 1){ println(it)} }



fun main() {

    //6
    var list = listOf(1,2,3,4,5)
    //list.map { println(it.times(2)) }

    val days = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    //days.map { print(it.uppercase() + " ") }
    //days.map { print(it.first()) }

    //7
    var list2: MutableList<String>
    list2 = days.filter { !it.contains("n") }.toMutableList()
   // println(list2)

    var list3 = list2.withIndex()
    //for(it in list3){println("item with ${it.index} = ${it.value}")}

    //println(list3.sortedBy{ it.value }.map { it.value})

    //8
    val array = Array(10) { (0..100).random() }
    array.forEach { println(it) }





}