// Collection

// map - key & value pair.

fun main() {
    val map = mapOf(Pair("name", "Matt"))
    val map2 = mutableMapOf<String, String>()
    map2["name"] = "Windy"
    map2["address"] = "New York"
    println(map)
    println(map2)
    println(map2.keys)
}