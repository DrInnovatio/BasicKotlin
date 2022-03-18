// Class Polymorphysm

fun main() {
    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()

    if(b is Cola){
        b.washDished()
    }

    var c = b as Cola
    c.washDished()
    b.washDished()
}

open class Drink {
    var name = "Drinks"

    open fun drink(){
        println("I drink ${name}. ")
    }
}

class Cola : Drink(){
    var type = "Cola"

    override fun drink(){
        println("I drink $type among ${name}.")
    }

    fun washDished(){
        println("$type used to wash dishes.")
    }
}