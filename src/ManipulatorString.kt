/**
* Created by bharadwaj on 7/24/2017.
*/
object ManipulatorString {

    fun reverse(word: String) : String{
        var reversed : String = ""
        for (index in word.length-1 downTo 0){
            reversed += word[index]
        }
        return reversed
    }
}