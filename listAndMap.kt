import java.util.*

fun main(args:Array<String>){
    var l= listOf(1, 2, 3, 4, 5)// this is the syntax to define the list in kotlin
    // or we specific the type or list like string just put <String >after the listof
    for (i in l){ //In this way to iterate the list
        println(i)
    }
    for ((index, number) in l.withIndex()){ // if you want the number with its index then you use this for loop

        println("Index is $index and number is $number")
    }
    var mapSet=TreeMap<String, Int >()// this is the way to initialize the TreeMap in kotlin
    // You add the value in the Tree Map simply the use the square bracket
    mapSet["Divyanshu"]=5
    mapSet["Divyansh"]=6

    for ((name, age) in mapSet){
        println("$name : $age")
    }
}