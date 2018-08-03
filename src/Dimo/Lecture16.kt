package Dimo// Object
/**
fun Dimo.main() {
    println(Dimo.Counter.count)

    Dimo.Counter.countUp()
    Dimo.Counter.countUp()

    println(Dimo.Counter.count)

    Dimo.Counter.clear()

    println(Dimo.Counter.count)
}

object Dimo.Counter {
    var count = 0

    fun countUp(){
        count++
    }
    fun clear(){
        count = 0
    }
}

 **/
fun main() {
    var a = FoodPoll("Raman")
    var b = FoodPoll("Sushi")

    a.vote()
    a.vote()
    a.vote()

    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("Total : ${FoodPoll.total}")
}

class FoodPoll (val name: String) {
    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        total++
        count++
    }
}

