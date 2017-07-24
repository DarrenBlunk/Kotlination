/**
* Created by bharadwaj on 7/24/2017.
*/
fun main(args: Array<String>) {

    Display()
    Chooser(readLine()!!.toInt())
}
fun Display(){
    val line = "*******************************"
    val text = "Please Enter the number of the option you want to choose.\n " +
            "1) Hello World \n 2) Addition \n 3) Reverse \n 4)More"
    println(line + "\n" + text + "\n" + line)
}

fun Chooser(option :Int){
    when (option) {
            //Prints Hello World
        1 -> HelloWorld()
            //Adding to Numbers
        2 -> {
            //Getting the input from the console and converting it to int.
            val a  =  readLine()!!.toInt()
            val b  =  readLine()!!.toInt()
            println(addition(a,b))
        }
            //Reads Line and Reverses the string.
        3 -> {
             val word = readLine()
             println(ManipulatorString.reverse(word!!))
        }
        4 -> print("More have to be added.")
        else -> {
            print("You choose an invalid number")
        }
    }
}
fun HelloWorld(){
    println("Hello, World")
}

fun addition(a:Int, b:Int) : Int{
    val c  = a + b
    return c
}

