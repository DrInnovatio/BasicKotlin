fun main() {
    b(::a)

    val c: (String) -> Unit = {str -> println("$str lamda function")}
    val d = {str:String -> println("$str another lamda function")}

    b(c)
    b(d)
}

fun a (str : String){
    println("$str function a")
}

fun b (function : (String) -> Unit){
    function("b calls it.")
}