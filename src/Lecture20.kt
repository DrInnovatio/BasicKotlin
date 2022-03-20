// ABOUT List and mutable list
fun main() {
    val a = listOf("apple", "orange", "pear", "strawberry", "grape")
    println(a[1])

    for(fruit in a ){
        print("${fruit} , ")
    }
    println()

    val b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2, 8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)
}