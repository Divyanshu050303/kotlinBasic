open class Man // with the open keyword we allow the other classes to inherit this class
{
    open fun child()// with the open keyword we allow the function overriding in kotlin
    {
        println("This is the man class function")
    }
}
class Women :Man() // this the way to inherit the another class
//multiple inheritance  is not applicable in kotlin
{
    override fun child()
    {
        println("This is the Women class function")
    }
}
fun main(args:Array<String>)
{
    var name=Women()// Women class Object
    var name1=Man()//Men class Object
    name.child()
    name1.child()
}