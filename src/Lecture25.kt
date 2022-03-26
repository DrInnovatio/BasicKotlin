// Data Class and Enum Class

fun main() {

//    val a = General("James", 212)
//
//    println(a == General("James", 212))
//    println(a. hashCode())
//    println(a)
//
//    val b = Data("Luda", 306)
//
//    println(b == Data("Luda", 306))
//    println(b.hashCode())
//    println(b)
//
//    println(b.copy())
//    println(b.copy("Arin"))
//    println(b.copy(id = 618))

// ==================================================

//    val list = listOf(Data("James", 212),
//                        Data("Luda", 306),
//                        Data("Arin", 618))
//
//    for((a, b) in list){
//        println("${a},   ${b}")
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

