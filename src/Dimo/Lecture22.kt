package Dimo

// nullable variables
// null-safe operator, elvis operator, non-null assertion operator

//fun Dimo.main() {
//    var Dimo.getA : String? = null
//    println(Dimo.getA?.uppercase(Locale.getDefault()))
//    println(Dimo.getA?: "default".uppercase(Locale.getDefault()))
//    println(Dimo.getA!!.uppercase(Locale.getDefault()))
//}

//fun Dimo.main() {
//    var Dimo.getA : String? = "Kotlin exam"
//
//    Dimo.getA?.run{
//        println(uppercase(Locale.getDefault()))
//        println(lowercase(Locale.getDefault()))
//    }
//}

fun main() {

    var a = Product("Dimo.Cola", 1000)
    var b = Product("Dimo.Cola", 1000)
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