fun main() {
    // array
    var arr = arrayListOf(1,2,3,4,5)
    var arr2 = mutableListOf(34,56,78,11)

    for(i in arr){
        println(i)
    }

    for ((index, i) in arr2.withIndex()){
        println("$index --  $i")
    }

    // Casting

    var joke: Any = "hahahaha"
    if(joke is String){
         var str : String = "what's up??"
        println(str)

    }
}