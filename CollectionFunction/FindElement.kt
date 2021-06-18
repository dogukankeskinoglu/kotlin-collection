package CollectionFunction

fun main(){
    val nameList= listOf<String>("Dogukan","Ali","Hamza","Ceren","Selin","Cansu","Irem","Fatih","Yağız")

    println(nameList.find { it=="Dogukan" })//Dogukan

    println(nameList.find { it.length==5 })//Hamza

    println(nameList.findLast { it.length==5 })//Yağız

    println(nameList.filter { it.length==5 })//[Hamza, Ceren, Selin, Cansu, Fatih, Yağız]

}