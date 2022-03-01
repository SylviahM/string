fun main(){
    var name = "akirachix"
    var y = name[0].toString()+ name[2] +name[3]
    println(y)
    var u = details("Sylviah",22)
    println(u)
    var b=text("lilian")
    println(b.count())
    var h =fact("sailenyi")


}
fun details(name:String,age:Int):String{
    var t = "my name is $name i have $age years old"
    return t
    }
fun text(name: String):String{
    var name="lilian"
    return name
}
fun fact(name: String){
    if(name=="sailenyi")
        println("That is me")
    else
        println("I do not know who that is")
}
































