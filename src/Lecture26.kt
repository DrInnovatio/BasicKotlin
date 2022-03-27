// Collection set and list
//
//fun main() {
//
//    val a = mutableListOf("Orange", "Banana", "Kiwi")
//
//    for( item in a){
//        println("$item")
//    }
//
//    a.add("grape")
//    println(a)
//
//    a.remove("Banana")
//    println(a)
//
//    println(a.contains("Orange"))
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