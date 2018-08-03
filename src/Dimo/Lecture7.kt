package Dimo

fun main() {

    for(i in 1..10) {
        if (i == 3) break
        print("$i ")
    }

    println()

    for(k in 1..10){
        if(k == 4) continue
        print("$k ")
    }
    // All numbers are printed except 4.

    println()

    loop@for (i in 1..10){
        for (j in 1..10){
            if(i == 1 && j == 2) break@loop
            println("i : $i, j: $j")
        }
    }
    //Using labels to control the for loop.

}