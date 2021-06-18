fun main(){

    //Immutable map
    val mapExample= mapOf<String,Int>("Java" to 3,"Python" to 2)

    //Mutable map
    val mutableMapExample= mutableMapOf<String,Int>("Kotlin" to 10,"Dart" to 5)

    //Add Element
    mutableMapExample["C#"] = 5
    println(mutableMapExample)

    //Delete Element
    mutableMapExample.remove("C#")
    println(mutableMapExample)

    //Clear Map
    mutableMapExample.clear()
    println(mutableMapExample)
}