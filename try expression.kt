import java.lang.NumberFormatException

fun main(args:Array<String>){
    var str:String="4s"
    var num :Int=0
    try {
        num=str.toInt()
    }
    catch (e: NumberFormatException){
        println("You don't give a proper input ")
    }
}