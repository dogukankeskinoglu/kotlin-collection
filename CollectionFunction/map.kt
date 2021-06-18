package Model

fun main(){

    val numbers=(0..10).toMutableList()

    print(numbers.map { if (it%2==0) "$it:even" else "$it:odd" })
    //[0:even, 1:odd, 2:even, 3:odd, 4:even, 5:odd, 6:even, 7:odd, 8:even, 9:odd, 10:even]
}
