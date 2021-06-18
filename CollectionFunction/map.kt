package Model

fun main(){

    val numbers=(0..10).toMutableList()

    print(numbers.map { if (it%2==0) "$it:even" else "$it:odd" })
}