package Dimo// Collection Function

fun main() {

    val nameList = listOf("Park", "James", "Jisoo", "Paul", "Yoona", "Jiwoo")

    nameList.forEach{print("$it ,  ")}
    println()
    println(nameList.filter{it.startsWith("Ji")})
    println()
    println(nameList.map{"NAME :  $it"})
    println()
    println(nameList.any{it == "Paul"})
    println()
    println(nameList.all{it.length == 4})
    println()
    println(nameList.none{it.startsWith("J")})
    println()
    println(nameList.first{it.startsWith("P")})
    println(nameList.last{it.startsWith("J")})
    println(nameList.count{it.contains("oo")})




}

