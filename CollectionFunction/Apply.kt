package CollectionFunction

fun main(){
    val word="Example"

    word.apply {
        println(isEmpty())
        println(length)
        println(this[0].isUpperCase())
    }

    val number= listOf(1,2,3,4,5,6,7,8)

    number.apply {
        println(contains(4))
        println(containsAll(listOf(4,6,8)))
        println(count())
        println(count{it<5})
        println(filterNot { it>5 })
    }
}