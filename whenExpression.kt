// In kotlin we have when in the place of switch but little bit of difference in syntax
// Let see what is the difference
fun main(srgs:Array<String>){
    var num =4
    //this work as the function define with void keyword in java or any other language
    when(num){
        1->println("One")
        2->println("Two")
        3-> println("Three")
        // instead of default we have else in when
        // so
        else->println("Give a proper input")
    }
    //This work as the function define with int keyword
    num=3
    var str=when(num){
        1->"One"  // or we can say when the condition is true it return the value to the str
        2->"Two"
        3->"Three"
        else->"Give the proper input"
    }
    println("The value of str is $str")
}
