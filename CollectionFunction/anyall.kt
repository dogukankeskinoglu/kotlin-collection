package CollectionFunction

fun main() {

    val password = "missiere*"
    val password2 = "missiere*U"
    //En az bir char büyük harf ise true(false döner)
    println(password.any { it.isUpperCase() })

    //Bütün charlar harf ise true(*'dan dolayı false döner)
    println(password2.all { it.isLetter() })

    //Hiçbir char sayı değil ise true
    println(password2.none { it.isDigit() })

    val numbers = (0..10 step 2).toMutableList()

    println(numbers.all { it % 2 == 0 })

    println(numbers.any { it == 5 })

}