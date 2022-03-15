/**
 * Scope Function
 *
 * apply, run, with, also, let
 *
 * with is almost same with run
 * ex) a.run{}   with(a){} ==> difference.
 *
 * **/



fun main() {

    var price = 5000

    val a = Book("Dimo Kotlin", 10000).apply {
        title = "[DISCOUNT!!] $title"
        discount()
    }
    a.run{
        println("Item : ${title}, Price : $price won.")
    }

    a.let {
        println("Item : ${it.title}, Price : ${it.price} won.")
    }
}

class Book (var title : String , var price : Int){
    fun discount(){
        price -= 2000
    }
}