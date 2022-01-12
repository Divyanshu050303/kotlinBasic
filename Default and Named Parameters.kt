fun main(args:Array<String>){
    var finanAmount=calAmount(50, 0.04)
    println(finanAmount)

}
fun calAmount(atm:Int, interest:Double):Int{
    return (atm+atm*interest).toInt()
}
