package Dimo// Basic structure of CLASS.

fun main() {

    val a = Person("James", 1998)
    val b = Person("Laura", 2003)

//    println("Hello My name is ${Dimo.getA.name} and I was born in ${Dimo.getA.birthYear}")
//    println("Hello My name is ${Dimo.b.name} and I was born in ${Dimo.b.birthYear}")

    a.introduce()
    b.introduce()

    println()

    val messi = Player("Messi", 34)
    val ronaldo = Player("Ronaldo", 40)

    messi.record()
    ronaldo.record()

    messi.car("Sonata")
    ronaldo.car("Santafe")

}

class Person(var name : String , val birthYear : Int ){
    fun introduce() {
        println("Hello My name is ${name} and I was born in ${birthYear}. nice to meet you.")
    }
}

class Player(var name : String, val score : Int){
    fun record(){
        println("$name made $score goals last season.")
    }

    fun car(car : String) {
        println("He has Dimo.getA $car.")
    }
}