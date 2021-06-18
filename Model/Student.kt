package Model

import enum.GenderEnum

data class Student(
    val name:String,
    val classNo:Int,
    val gender:GenderEnum,
    val lessons:List<Lesson>,
)
