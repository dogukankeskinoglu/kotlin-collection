fun main() {

    val sentence = "Bugün sizlere kotlin collectionlar ile bilgi vereceğim. Bu örnekte sizlere filter örneği vereceğim"

    val words=sentence.split(" ")

    println(words.filter { it[0].isUpperCase() })
    //[Bugün, Bu]

    println(words.filter{it.length>5})
    //[sizlere, kotlin, collectionlar, vereceğim., örnekte, sizlere, filter, örneği, vereceğim]

    println(words.filterNot{it.length>5})
    //[Bugün, ile, bilgi, Bu]

    println(words.filterIndexed { index, value -> index%2==0 && value.length>=5  })
    //[Bugün, kotlin, vereceğim., örnekte, filter, vereceğim]

    val (conditionTrue, conditionFalse) = words.partition { it.length > 6 }
    println(conditionTrue)
    //[sizlere, collectionlar, vereceğim., örnekte, sizlere, vereceğim]
    println(conditionTrue)
    //[Bugün, kotlin, ile, bilgi, Bu, filter, örneği]

}
