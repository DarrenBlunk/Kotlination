/**
* Created by bharadwaj on 7/24/2017.
*/
fun main(args: Array<String>) {

    //Getting the input from the console and converting it to int.
    val a  =  readLine()!!.toInt()

    println(addition(5,a))
}

fun HelloWorld(){
    println("Hello, World")
}

fun addition(a:Int, b:Int) : Int{
    val c  = a + b
    return c
}