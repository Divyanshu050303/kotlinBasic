fun main(args:Array<String>){
    var name1="Divyanshu"
    var name2="Divyanshu"
    //There are two ways  to compare the string in the kotlin
    //first
    println("Comparison through the equal operator ")
    if(name1==name2)
        println("Both the string are same")
    else
        println("Both the string is not same")
    // second just like the java
    // first we go simple comparison
    println("Comparison through the equals() method ")
    if(name1.equals(name2))
        println("Both the string are same")
    else
        println("Both the string is not same")
    //second we go through the ignore case
    println("Comparison through the equals(String, True ) method")
    name1="Divyanshu"
    name2="divyanshu"
    if(name1.equals(name2,true))
        println("Both the string are same")
    else
        println("Both the string is not same")
}

