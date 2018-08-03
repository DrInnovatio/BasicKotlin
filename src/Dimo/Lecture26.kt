package Dimo// Collection set and list
//
//fun Dimo.main() {
//
//    val Dimo.getA = mutableListOf("Orange", "Banana", "Kiwi")
//
//    for( item in Dimo.getA){
//        println("$item")
//    }
//
//    Dimo.getA.add("grape")
//    println(Dimo.getA)
//
//    Dimo.getA.remove("Banana")
//    println(Dimo.getA)
//
//    println(Dimo.getA.contains("Orange"))
//
//}

fun main() {

    val a = mutableMapOf("Red" to "umpaumpa", "Twice" to "TT", "ITZY" to "ICY")

    for(entry in a){
        println("${entry.key} : ${entry.value}")
    }

    a.put("Lovelizy" , "gogogo")
    println(a)

    a.remove("ITZY")
    println(a)

    println(a["Red"])
    println(a["Twice"])

}