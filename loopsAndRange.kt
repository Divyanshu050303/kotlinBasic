// we all know the bacis loop in each programming language
// in kotlin we have for loop,while loop, do while loop
// first we demonstrate the for loop and there method to define the for loop
fun main(args:Array<String>){
    var num=1..5 // this is way to define the range in kotlin
    // instead of .. we use until but there is a condition in until the last value is not consider like we want to print
    // 1 to 16 but we use until the only 1 to 15 value was printed
    println("simple for loop")
    for (a in num){ // it is just like the for each loop in java
        println(a)
    }
    println("Increment by 2 after each iteration")
    for(a in num step 2){// in this we increment the value by 2 after the each iteration
        println(a)
    }
    //if we want to print the number in the ascending order then
    var num1=5 downTo 1 // down to is a method define in the int class in kotlin
    // instead of downto we use reversed function in the for loop
    //like num1.reversed()
    println("In ascending order")
    for (a in num1){
        println(a)
    }
    println("Demonstrating the working of while loop")
    var i=0
    while (i < 5){
        println(i)
        i++
    }
    println("Demonstrating the working of do while loop")
    var j=0
    do {
        println(j)
        j++
    }
        while (j<6)


}