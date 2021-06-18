package CollectionFunction

fun main(){


    val programmerLanguages= listOf<String>("python","java","C#","java","kotlin","kotlin","dart","javaScript")

    println(programmerLanguages.associateWith { it.length })
    //{Python=6, Java=4, C#=2, Kotlin=6}

    println(programmerLanguages.associateWith { it.length>3 })
    //{Python=true, Java=true, C#=false, Kotlin=true, Dart=true, JavaScript=true}

    println(programmerLanguages.associateWith { it.capitalize() })
    //{python=Python, java=Java, C#=C#, kotlin=Kotlin, dart=Dart, javaScript=JavaScript}

    println(programmerLanguages.associateWith { index->programmerLanguages.count { it==index } })
    //{Python=1, Java=2, C#=1, Kotlin=2, Dart=1, JavaScript=1}

    println(programmerLanguages.associateBy(keySelector ={it.first().toUpperCase()},valueTransform = {it.length}))
    //{P=6, J=10, C=2, K=6, D=4}

    println(programmerLanguages.associateBy {it.length})
    //{6=kotlin, 4=dart, 2=C#, 10=javaScript}


}