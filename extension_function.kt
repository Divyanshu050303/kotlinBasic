 fun main(args:Array<String>){
     var a1=helloworld()
     a1.name="JAVA"
     a1.show()
     var a2=helloworld()
     a2.name="SQL"
     a2.show()
var a3=a1.plus1(a2)
     a3.show()

 }
 fun helloworld.plus1(a:helloworld):helloworld
 {
     var newhelloworld=helloworld()
     newhelloworld.name=this.name+" "+a.name
     return newhelloworld
 }