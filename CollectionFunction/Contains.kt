package CollectionFunction

fun main(){
    val nameList= listOf<String>("Dogukan","Ali","Hamza","Ceren","Selin","Cansu","Irem","Fatih","Yağız")

    println(nameList.contains("Dogukan"))//True

    println(nameList.containsAll(listOf("Hamza","Ceren")))//True

    println(nameList.containsAll(listOf("Yağız","Safa")))//False

}