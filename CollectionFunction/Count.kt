fun main(){

    val numbers= listOf<Int>(1,1,2,2,2,2,3,3,3,4,)

    println(numbers.count())//List size

    println(numbers.count { it==4 })//Count of 4

    println(numbers.count { it>=3 })//Count of higher then 3

    println(numbers.count { it in 2..7 })//Count of 2,3,4,5,6,7

}