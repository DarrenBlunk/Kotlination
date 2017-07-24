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
            "1) Hello World \n 2) Addition \n 3) Reverse \n 4) Sum of the Number"
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
            println(Addition(a,b))
        }
            //Reads Line and Reverses the string.
        3 -> {
             val word = readLine()
             println(ManipulatorString.reverse(word!!))
        }
        4 -> {
            print("Type the value : ")
            sumOfNumber(readLine()!!.toInt())
        }
        else -> {
            print("You choose an invalid number")
        }
    }
}
fun HelloWorld(){
    println("Hello, World")
}

fun Addition(a:Int, b:Int) : Int{
    val c  = a + b
    return c
}

fun sumOfNumber(number:Int) {
    val translated = number.toString()
    //Unable to find way convert char to int directly. So, used string for now
    val sum :Int = (0..translated.length-1).sumBy { translated[it].toString().toInt()}
    print(sum)
}

