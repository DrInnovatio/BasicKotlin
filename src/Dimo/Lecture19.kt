package Dimo// Generic

fun main() {
    UsingGeneric(A()).doShouting()
    UsingGeneric(B2()).doShouting()
    UsingGeneric(C()).doShouting()

    doShouting(B2())
}

fun <T: A> doShouting(t: T){
    t.shout()
}

open class A {
    open fun shout() {
        println("Dimo.A is shouting!")
    }
}

class B2 : A() {
    override fun shout() {
        println("Dimo.B is shouting!")
    }
}

class C : A() {
    override fun shout() {
        println("Dimo.C is shouting!")
    }
}

class UsingGeneric<T: A> (val t: T){
    fun doShouting(){
        t.shout()
    }
}