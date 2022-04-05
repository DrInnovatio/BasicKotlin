import Dimo.Person

fun main() {
    // 1.class
    // 2. Data Class

    var cls = HelloClass()
    var cls2 = HelloClass(10)

    println(cls2.age)

    var car1 = Tesla("Model 3", 210.23, 32450.34)
    println("${car1.model} is $${car1.price} and the maximum speed is ${car1.price}.")

}

class HelloClass {
    var age: Int = 0

    init {
        age = 0
    }

    constructor() //default constructor
    constructor(age: Int) {
        this.age = age

    }
    //Secondary constructor

}

data class Tesla(var model: String, var maxSpeed : Double, var price : Double)


