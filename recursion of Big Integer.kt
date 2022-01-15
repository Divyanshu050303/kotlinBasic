import java.math.BigInteger

fun main(args:Array<String>)
{
    var num=BigInteger("70");// if we dealing with big integer than we always pass the integer the in the form of string in the BigInteger class

    println(fact(num))//here the print the value which return by the fact function
}
fun fact(num:BigInteger):BigInteger// if you have a very big integer and you want to find the factorial of that number
//than simply change the Int inside and out side the fact to BigInteger
{
if(num==BigInteger.ZERO)// 0 with BigInteger.ZERO
    return BigInteger.ONE// we didn't simply return the 1 instead of the we return BigInteger.ONE
else
    return num*fact(num-BigInteger.ONE)  // here the function itself again and again when the num is zero than the execution is stoped
}