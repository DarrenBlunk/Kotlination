/**
* Created by bharadwaj on 7/24/2017.
*/
fun main(args: Array<String>) {


    //HelloWorld()

    //Getting the input from the console and converting it to int.
    /*val a  =  readLine()!!.toInt()
    val b  =  readLine()!!.toInt()
    println(addition(a,b))*/

    //Reads Line and Reverses the string.
    val word = readLine()
    println(ManipulatorString.reverse(word!!))

}

fun HelloWorld(){
    println("Hello, World")
}

fun addition(a:Int, b:Int) : Int{
    val c  = a + b
    return c
}

