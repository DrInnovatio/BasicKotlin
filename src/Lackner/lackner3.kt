import java.lang.Exception
import kotlin.test.currentStackTrace

fun main() {
    // Try and Catch Block
    /**
    val number = readLine() ?:"0"
    val parsedNumber = try {
        number.toInt()
    }catch (e: Exception){
        0
    }
    println(parsedNumber)
    **/

    val list = listOf("Kotlin", "is", "fun")
    val count = list.customCount{ currentString ->
        currentString.length == 3
    }
    println(count)

}

fun <T>List<T>.customCount(function: (T) -> Boolean): Int {
    var counter = 0
    for(string in this){
        if(function(string)){
            counter++
        }
    }
    return counter
}