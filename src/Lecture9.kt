// What are the CONSTRUCTOR and secondary constructor ?

fun main() {
    val a = Person2("James", 1998)
    val b = Person2("Laura", 2003)

    val c = Person2("Karl")
    val d = Person2("Matthew")
    val e = Person2("Harry")
}

class Person2(var name : String , val birthYear : Int ){
    init  {
        println("Hello My name is ${this.name} and I was born in ${this.birthYear}. nice to meet you.")
    }

    constructor(name : String) : this(name, 1997){
        println("the secondary constructor is working.")
    }
}