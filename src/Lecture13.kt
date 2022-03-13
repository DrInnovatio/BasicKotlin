// Scope and Access Modifier.

/**
 *  In the Package Scope
 *
   public (default value) : Any package can access to this.

   internal : in the same module.

   private : in the same file.

 * **/

/**
 * In the class scope
 *
 * public (default value) : can access from the outside of the class.

   private : in the class.

   protected : class itself and inherited classes.

   internal : cannot use in the class.
 *
 * **/

fun main() {
    var a = "in the main class."
    println(a)
    B().print()
}

val a = "Package Scope" // can be shared with all classes.

class B {
    var a = "In the B class."
    fun print(){
        println(a)
    }
}

