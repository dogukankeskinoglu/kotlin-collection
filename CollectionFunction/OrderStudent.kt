package CollectionFunction

data class Student(
    var name:String,
    var surname:String,
    var class_no:Int,
    var student_no:Int,
    var age:Int,
)
fun main(){
    val nameList= listOf<String>("Dogukan","Ali","Hamza","Ceren","Selin","Cansu","Irem","Fatih","Yağız")
    val surnameList= listOf<String>("Keskinoglu","Yılmaz","Tosun","Soy","Sevinç","Atasoy","Dilek","Koç","Egeli")
    val classList= listOf<Int>(4,3,2,1,1,3,2,4,1)
    val studentNo=listOf<Int>(5160001,5160002,5160003,5160004,5160005,5160006,5160007,5160008,5160009)
    val ageList= listOf<Int>(40,23,20,16,24,23,22,20,18)
    val students=mutableListOf<Student>()
    for(index in nameList.indices){
        val student: Student =
            Student(nameList[index],
                surnameList[index],
                classList[index],
                studentNo[index],
                ageList[index],
                )
        students.add(student)
    }

    students.sortedBy { it.age}.forEach {
        println(it)
    }
    /*
    Student(name=Ceren, surname=Soy, class_no=1, student_no=5160004, age=16)
    Student(name=Yağız, surname=Egeli, class_no=1, student_no=5160009, age=18)
    Student(name=Hamza, surname=Tosun, class_no=2, student_no=5160003, age=20)
    Student(name=Fatih, surname=Koç, class_no=4, student_no=5160008, age=20)
    Student(name=Irem, surname=Dilek, class_no=2, student_no=5160007, age=22)
    Student(name=Ali, surname=Yılmaz, class_no=3, student_no=5160002, age=23)
    Student(name=Cansu, surname=Atasoy, class_no=3, student_no=5160006, age=23)
    Student(name=Selin, surname=Sevinç, class_no=1, student_no=5160005, age=24)
    Student(name=Dogukan, surname=Keskinoglu, class_no=4, student_no=5160001, age=40)
    */



}