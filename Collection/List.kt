package Collection

fun main(){

    //Immutable List
    val immutableList= listOf<Any>(1,2,3,4,5,6,"S")
    val immutableList2= listOf<Int>(1,2,3,4,5,6)
    val immutableList3= listOf("A","B","C")


    //Mutable List
    val cityLists= mutableListOf<String>("Istanbul","London","Berlin","Moscow","Madrid","Roma","Kiev","Paris")

    //ADD
    //Multiple elements add
    cityLists.addAll(listOf("Munich","Kazan"))
    cityLists.printList()
    //Add element with using index
    cityLists.add(1,"Izmir")
    cityLists.printList()
    //Add element
    cityLists.add("Barcelona")
    cityLists.printList()

    //DELETE
    //Multiple elements delete
    cityLists.removeAll(listOf("Berlin","Moscow"))
    cityLists.printList()
    //Delete elements with using custom function
    cityLists.removeIf { it.length>6 }
    cityLists.printList()
    //Delete element with using index
    cityLists.removeAt(0)
    //Delete element
    cityLists.remove("Paris")
    cityLists.printList()

    //UPDATE
    cityLists[4] = "Ankara"


}

fun MutableList<String>.printList(){
    println(this)
}