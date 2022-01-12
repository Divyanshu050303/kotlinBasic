fun main(args:Array<String>){ // the execetution is started from here or we can say that this is the entry point of the program
    add(4, 5)// call the void function
    var a=8
    var b=6
    println("Sum of $a and$b is :"+add1(a, b))// call the Int function
    a=9
    b=8
    println("Sum of $a and$b is :"+add2(2, 4))// call the Int function in one line
    b=6
    a=5
    println("max of $a and$b is :"+max(8, 9))// call the max function which return the maximum value

}
fun add(a:Int, b:Int ){// this is the user define function with no return type
    // just like the void function in the java or any other language
    println("Sum of $a and$b is :"+a+b)

}

fun add1(a:Int , b:Int):Int{
    // this is the return function in the kotlin
    // after the define the function put colon and the Int
    return a+b
}
fun add2(a:Int, b:Int):Int =a+b // this is the in one line return function
fun max(a:Int ,b:Int) :Int =if(a>b) a else b