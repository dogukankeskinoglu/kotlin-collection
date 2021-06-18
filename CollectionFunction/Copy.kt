package CollectionFunction

fun main(){
    val nameList= listOf<String>("Dogukan","Ali","Hamza","Ceren","Selin","Cansu","Irem","Fatih","Yağız")

    val names=nameList.toMutableList()
    val names2=nameList.toList()//Read-Only
    names.add("Hasan")
    println("Main List:$nameList \nCopy List:$names")

    //Main List:[Dogukan, Ali, Hamza, Ceren, Selin, Cansu, Irem, Fatih, Yağız]
    //Copy List:[Dogukan, Ali, Hamza, Ceren, Selin, Cansu, Irem, Fatih, Yağız, Hasan]
}