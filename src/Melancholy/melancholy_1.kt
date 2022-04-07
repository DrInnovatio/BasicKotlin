//[센치한 개발자] (25) 안드로이드 코틀린 기초 강좌 : 코틀린(Kotlin) 기초문법, 예제 설명 - 1

fun main() {
    val hello1 = "What the heck???"
    var hello2  = "Hello2 world"
    var foo : String? = null
    println(foo)
    println(hello())
    println(hello1)
    println(hello2)
}

fun hello(): String {
    return "Returning now"
}


