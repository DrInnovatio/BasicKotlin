package Dimo// Advanced variables, constants, lateinit, Lazy delegate properties

//fun Dimo.main() {
//
//    val foodCourt = FoodCourt()
//
//    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
//    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
//    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
//}
//
//class FoodCourt {
//    fun searchPrice(foodName : String){
//        val price = when(foodName){
//            FOOD_CREAM_PASTA ->15000
//            FOOD_STEAK -> 25000
//            FOOD_PIZZA -> 15000
//            else -> 0
//        }
//        println("$foodName is ${price}.")
//    }
//
//    companion object{
//        const val FOOD_CREAM_PASTA = "Cream pasta"
//        const val FOOD_STEAK = "Meat"
//        const val FOOD_PIZZA = "Pizza"
//    }
//}
//
//fun Dimo.main() {
//    val Dimo.getA = LateInitSample()
//    println(Dimo.getA.getLateInitText())
//    Dimo.getA.text = "Dimo.A new value assigned."
//    println(Dimo.getA.getLateInitText())
//}
//
//class LateInitSample {
//    lateinit var text : String
//
//    fun getLateInitText() : String{
//        if(::text.isInitialized){
//            return text
//        }
//        else
//        {
//            return "Default Value"
//        }
//    }
//}

fun main() {
    val number : Int by lazy {
        println("being initialized")
        7
    }
    println("The code just started.")
    println(number)
    println(number)
}