// Coroutines - The last Lecture 31
// Global Scope vs. CoroutineScope(Dispatchers)

import kotlin.coroutines.*



fun main() {
    runBlocking{
        var result = withTimeoutOrNull(){
            for(i in 1..10){
                println(i)
                delay(10)
            }
            "FINISH"
        }
        print(result)
    }
}


