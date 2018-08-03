package Dimo// class inheritance.

fun main() {
    var a = Animal("lolo", 7, "Dimo.Dog")
    var b = Dog("lolo", 7)

    a.introduce()
    b.introduce()

    b.bark()

    var c = Cat("koko", 2)
    c.introduce()
    c.meow()
}

open class Animal (var name : String, var age : Int, var type : String){
    fun introduce(){
        println("I am $type $name and $age years old ")
    }
}

class Dog (name : String, age : Int) : Animal(name, age, "Dimo.Dog") {
    fun bark(){
        println("bow wow")
    }
}

class Cat (name : String, age : Int) : Animal(name, age, "Dimo.Cat") {
    fun meow(){
        println("Mee eow~")
    }
}