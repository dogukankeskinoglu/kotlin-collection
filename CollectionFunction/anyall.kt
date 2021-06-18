package CollectionFunction

fun main() {

    val password = "missiere*"
    val password2 = "missiere*U"
    
    println(password.any { it.isUpperCase() })//false
    
    println(password2.all { it.isLetter() })//false
    
    println(password2.none { it.isDigit() })//true

    val numbers = (0..10 step 2).toMutableList()

    println(numbers.all { it % 2 == 0 })//true

    println(numbers.any { it == 5 })//false


}
