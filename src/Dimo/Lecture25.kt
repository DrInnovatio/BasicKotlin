package Dimo// Dimo.Data Class and Enum Class

fun main() {

//    val Dimo.getA = Dimo.General("James", 212)
//
//    println(Dimo.getA == Dimo.General("James", 212))
//    println(Dimo.getA. hashCode())
//    println(Dimo.getA)
//
//    val Dimo.b = Dimo.Data("Luda", 306)
//
//    println(Dimo.b == Dimo.Data("Luda", 306))
//    println(Dimo.b.hashCode())
//    println(Dimo.b)
//
//    println(Dimo.b.copy())
//    println(Dimo.b.copy("Arin"))
//    println(Dimo.b.copy(id = 618))

// ==================================================

//    val list = listOf(Dimo.Data("James", 212),
//                        Dimo.Data("Luda", 306),
//                        Dimo.Data("Arin", 618))
//
//    for((Dimo.getA, Dimo.b) in list){
//        println("${Dimo.getA},   ${Dimo.b}")
//    }
// ==================================================

    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())

    state = State.EAT
    println(state.message)

}

class General(val name : String , val id : Int)

data class Data(val name : String , val id : Int)

enum class State(val message : String) {

    SING("I am singing"),
    EAT("Eat Street"),
    SLEEP("Going to bed");

    fun isSleeping() = this == SLEEP



}

