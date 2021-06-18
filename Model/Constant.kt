package Model

import enum.GenderEnum

object Constants{
    const val MAX_AGE=18
    const val MIN_AGE=10

    val surnameList= listOf<String>("Keskinoglu","Yılmaz","Tosun","Soy","Sevinç","Atasoy","Dilek","Koç","Egeli")
    val classList= listOf<Int>(4,3,2,1,1,3,2,4,1)
    val studentNo=listOf<Int>(5160001,5160002,5160003,5160004,5160005,5160006,5160007,5160008,5160009)
    val ageList= listOf<Int>(40,23,20,16,24,23,22,20,18)
    val heightList= listOf<Double?>(1.88,null,1.75,null,1.60,1.80,1.90,1.91,1.81)
    val lessons= listOf<Lesson>(
        Lesson(lessonName = "Software Engineering" ,lessonClass =4,isOptional = false),
        Lesson(lessonName = "Data Science",lessonClass =3,isOptional = true),
        Lesson(lessonName = "Airtifical Intelligence",lessonClass =3,isOptional = true),
        Lesson(lessonName = "Micro Service",lessonClass =4,isOptional = false),
        Lesson(lessonName = "Programming Language",lessonClass =2,isOptional = false),
        Lesson(lessonName = "Algorithm Analysis",lessonClass = 3,isOptional = false),
        Lesson(lessonName = "Calculus 1",lessonClass =1,isOptional = false),
        )
    val students= listOf<Student>(
        Student(
            name="Robert",
            classNo = 4,gender = GenderEnum.MALE,
            lessons = listOf(lessons[0], lessons[1],lessons[2], lessons[3]),
        ),
        Student(
            name="Mary",
            classNo = 3,gender = GenderEnum.FEMALE,
            lessons = listOf(lessons[0], lessons[1],lessons[4]),
        ),
        Student(
            name="George",
            classNo = 2,gender = GenderEnum.MALE,
            lessons = listOf(lessons[0], lessons[3],lessons[5], lessons[7]),
        ),
        Student(
            name="Steven",
            classNo = 2,gender = GenderEnum.MALE,
            lessons = listOf(lessons[0], lessons[2],lessons[6]),
        ),
        Student(
            name="Edward",
            classNo = 1,gender = GenderEnum.MALE,
            lessons = listOf(lessons[7]),
        ),
        Student(
            name="Barbara",
            classNo = 4,gender = GenderEnum.MALE,
            lessons = listOf(lessons[0], lessons[1]),
        ),
        Student(
            name="Linda",
            classNo = 4,gender = GenderEnum.MALE,
            lessons = listOf(lessons[0]),
        ),
        Student(
            name="Maria",
            classNo = 4,gender = GenderEnum.MALE,
            lessons = listOf(lessons[0], lessons[1],lessons[2],lessons[3], lessons[4],lessons[5]),
        ),
    )
}