// Collection Function 2
//
//fun main() {
//
//    data class Person(val name : String, val birthYear : Int)
//
//    val personList = listOf(
//        Person("Yoona", 1992),
//        Person("Joy", 1998),
//        Person("Choo", 2001),
//        Person("Yoona", 2002))
//
//    println(personList.associateBy {it.birthYear})
//    println(personList.groupBy { it.name })
//
//    val(over98, under98) = personList.partition { it.birthYear > 1998 }
//    println(over98)
//    println(under98)
//
//}

fun main() {

    val numbers = listOf(-3, 7, 2, -10, 1)

    println(numbers.flatMap { listOf(it * 10, it + 10) })

    println(numbers.getOrElse(1){50})
    println(numbers.getOrElse(10){50})

    val names = listOf("A", "B", "C", "D")

    println(names zip numbers)
}