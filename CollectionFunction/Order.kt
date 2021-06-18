fun main(){

    val sentence = "Bugün sizlere kotlin collectionlar ile bilgi vereceğim. Bu kısımda order örneği olacak"

    val words=sentence.split(" ").toMutableList()

    println(words)
    //[Bugün, sizlere, kotlin, collectionlar, ile, bilgi, vereceğim., Bu, kısımda, order, örneği, olacak]

    println(words.sortedWith(compareBy { it.length }))
    //[Bu, ile, Bugün, bilgi, order, kotlin, örneği, olacak, sizlere, kısımda, vereceğim., collectionlar]

    println(words.sorted())
    //[Bu, Bugün, bilgi, collectionlar, ile, kotlin, kısımda, olacak, order, sizlere, vereceğim., örneği]

    println(words.sortedDescending())
    //[örneği, vereceğim., sizlere, order, olacak, kısımda, kotlin, ile, collectionlar, bilgi, Bugün, Bu]

    println(words.sortedBy { it.length })
    //[Bu, ile, Bugün, bilgi, order, kotlin, örneği, olacak, sizlere, kısımda, vereceğim., collectionlar]

    println(words.sortedByDescending { it.last() })
    //[Bu, collectionlar, order, Bugün, kotlin, olacak, bilgi, örneği, sizlere, ile, kısımda, vereceğim.]


    println(words)
    //[Bugün, sizlere, kotlin, collectionlar, ile, bilgi, vereceğim., Bu, kısımda, order, örneği, olacak]
    val asReversedList=words.asReversed()
    val reveredList=words.reversed()
    words.add("son")

    println(reveredList)
    //[olacak, örneği, order, kısımda, Bu, vereceğim., bilgi, ile, collectionlar, kotlin, sizlere, Bugün]

    println(asReversedList)
    //[son, olacak, örneği, order, kısımda, Bu, vereceğim., bilgi, ile, collectionlar, kotlin, sizlere, Bugün]


    println(words.shuffled())
    //[collectionlar, order, kısımda, vereceğim., Bu, olacak, bilgi, ile, örneği, kotlin, Bugün, sizlere, son]
}