import Dimo.Cat

fun main() {
    val bear = object : Animal3("Camembear") {
        override fun makeSound() {
            println("RoooER!!")
        }
    }
}

