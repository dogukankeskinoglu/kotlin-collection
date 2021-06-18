package CollectionFunction

fun main(){

    val list= listOf(listOf(0,2,4,6,8),listOf(1,3,4,5,6,7))

    println(list.flatten())
    //[0, 2, 4, 6, 8, 1, 3, 4, 5, 6, 7]
    println(list.flatten().sorted())
    //[0, 1, 2, 3, 4, 4, 5, 6, 6, 7, 8]

    println(list.flatMap { it.map {m-> if (m%2==0) "$m:even" else "$m:add"  } })
    //[0:even, 2:even, 4:even, 6:even, 8:even, 1:add, 3:add, 4:even, 5:add, 6:even, 7:add]
}