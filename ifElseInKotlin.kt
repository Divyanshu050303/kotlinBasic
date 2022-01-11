//class ifElseInKotlin {
//    var num1=4
//    var num2=5
//    if (num)
//}
// There are twoway to use if else statement in the kotlin
fun main(args:Array<String>){
    var num1=6
    var num2=5
    // First one is
    if (num1>num2)
        println("$num1 is greater than the $num2" )
    else
        println("$num2 is greater than the $num1")
    //Second one is
    var result=0
    result= if (num1>num2)
        num1

    else
        num2
println(result)
    //Else if in kotlin
     var num3=4
    var num4=6
    result= if (num3>num4)
        num3-num4
    else if(num1==num2)
        num3+num4
    else
        num4-num3
    println(result)

}
