fun main(args:Array<String>){
    var a1=helloworld()
    a1.name="JAVA"
    a1.show()
    var a2=helloworld()
    a2.name="SQL"
    a2.show()
    var a3=a1 plus2 a2// here we call the infix function which make it more readable
    a3.show()
    var a4=a1 + a2 // this the operator overloading here we call the plus function using the + operator
    a4.show()

}
infix fun helloworld.plus2(a:helloworld):helloworld// with the help or infix se made code more readable
// infix take only one parameter
{
    var newhelloworld=helloworld()
    newhelloworld.name=this.name+" "+a.name
    return newhelloworld
}
operator infix fun helloworld.plus(a:helloworld):helloworld
{
    var newhelloworld=helloworld()
    newhelloworld.name=this.name+" "+a.name
    return newhelloworld
}