
fun main(){
    val firstList= listOf<String>("collection","kotlin","android")
    val secondList= listOf<Int>(10,6,7)
    val thirdList= listOf<Int>(10,6)

    println(firstList.zip(secondList))
    //[(collection, 10), (kotlin, 6), (android, 7)]
    println(firstList.zip(thirdList))
    //[(collection, 10), (kotlin, 6)]
}