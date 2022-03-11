// overriding and abstraction

/**
fun main() {
    val baby = Tiger()
    baby.eat()

    var cus1 = Bank("James", 78676443, 67865.56)
    cus1.cms()
    var cus2 = Serving("Brandon", 67658897)
    cus2.cms()
    cus2.money()
}

open class Bank (var customer : String, var accountNumber : Int , var income : Double){
    open fun cms(){
        println("$customer's account number is $accountNumber.")
    }
}

class Serving (customer : String, accountNumber : Int ) : Bank (customer, accountNumber, 12133.34){
    fun money(){
        println("he loves money!! $income")
    }
}

open class Animal2 {
    open fun eat(){
        println("having food.")
    }
}

class Tiger : Animal2(){
    override fun eat(){
        println("already ate a lot.")
    }
}
**/

fun main() {
    val james = Soldier()
    james.shield()
    james.shooting()
}

interface Shoot {
    fun shooting()
}

interface Defence {
    fun shield(){
        println("Use your shield.")
    }
}

class Soldier : Shoot, Defence {
    override fun shooting() {
        println("Shoot the enemies.")
    }

    override fun shield() {
        println("Too late withdraw hurry up!!")
    }

}