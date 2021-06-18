package CollectionFunction

fun main(){

    val programmerLanguages= listOf<String>("python","java","C#","java","kotlin","kotlin","dart","javaScript")

    val mapOf= listOf("Istanbul" to "Turkey", "London" to "England", "Munich" to "Germany", "Berlin" to "Germany")

    println(mapOf.groupBy({ it.second }, { it.first }))
    //{Turkey=[Istanbul], England=[London], Germany=[Munich, Berlin]}

    println(programmerLanguages.groupingBy {it}.eachCount())
    //{python=1, java=2, C#=1, kotlin=2, dart=1, javaScript=1}

    println(programmerLanguages.groupingBy { it.length }.eachCount())
    //{6=3, 4=3, 2=1, 10=1}

    println(programmerLanguages.groupBy {it.length })
    //{6=[python, kotlin, kotlin], 4=[java, java, dart], 2=[C#], 10=[javaScript]}

    val string= listOf<String>("adana","ankara","izmir","istanbul","trabzon")

    println(string.groupBy { it.length })
    //{5=[adana, izmir], 6=[ankara], 8=[istanbul], 7=[trabzon]}

}