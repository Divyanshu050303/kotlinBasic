class Human constructor(var n:String)// This is the way to call the constructor in the
//kotlin simply write constructor with the class name if there is any modifier specific the
// it is necessary frist write the constructor keyword and than pass the parameter
// and pass the parameter
// or we simply pass the value just after the class name no need to write the constructor keyword
{
    var name=n
    fun what()
    {
        println("What dou you want in your life?")
        println(name)
    }
}
fun main(agrs:Array<String>)
{
    var nam=Human("Divyanshu")//this is the object of human class which we define upper
    //
    nam.what()// this is the simply calling the function inside the human class with the help of human
    // class object

}