package CollectionFunction



fun main() {
    val nameList= listOf<String>("Dogukan","Ali","Hamza","Ceren","Selin","Cansu","Irem","Fatih","Yağız")

    nameList.forEach {
        println(it)
    }

    nameList.forEach {
            element-> println(element)
    }
    for (i in nameList.indices ){
        println(nameList[i])
    }
    for((index,value) in nameList.withIndex()){
        println("Index:$index Value:$value")
    }

}