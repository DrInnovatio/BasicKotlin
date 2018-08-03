package Dimo// Nested Class and Inner Class.

fun main() {
    Outer.Nested().introduce()

    val outer = Outer()
    val inner = outer.Inner()

    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Changed outer class."
    inner.introduceOuter()
}

class Outer{
    var text = "This is outer class."

    class Nested {
        fun introduce(){
            println("Nested Class")
        }
    }

    inner class Inner {
        var text = "This inner class."

        fun introduceInner(){
            println(text)
        }

        fun introduceOuter(){
            println(this@Outer.text)
        }
    }
}