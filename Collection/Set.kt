fun main(){

    val answers= listOf("Java,Python,Kotlin,Dart","Python,JavaScript,COBOL","Java,C#,C","R,C++,Java,Kotlin")

    val immutableSet= setOf<String>("A","B","C","B","D")
    println(immutableSet)

    val languagesSet= mutableSetOf<String>()
    answers.forEach {
        answer->
        answer.split(",").forEach {
            languagesSet.add(it)
        }
    }
    println(languagesSet)


}