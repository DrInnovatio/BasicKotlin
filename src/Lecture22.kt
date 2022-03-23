import java.util.*

// nullable variables
// null-safe operator, elvis operator, non-null assertion operator

//fun main() {
//    var a : String? = null
//    println(a?.uppercase(Locale.getDefault()))
//    println(a?: "default".uppercase(Locale.getDefault()))
//    println(a!!.uppercase(Locale.getDefault()))
//}

//fun main() {
//    var a : String? = "Kotlin exam"
//
//    a?.run{
//        println(uppercase(Locale.getDefault()))
//        println(lowercase(Locale.getDefault()))
//    }
//}

fun main() {

    var a = Product("Cola", 1000)
    var b = Product("Cola", 1000)
    var c = a
    var d = Product("Sprite", 1000)

    println(a==b)
    println(a===b)

    println(a==c)
    println(a===c)

    println(a==d)
    println(a===d)

}

class Product(val name : String, val price : Int){
    override fun equals(other: Any?) : Boolean {
        if(other is Product){
            return other.name == name && other.price == price
        }else {
            return false
        }
    }
}