fun main(){

    val numbers=(0..10).toList()
    println(numbers.chunked(2))
    //[[0, 1], [2, 3], [4, 5], [6, 7], [8, 9], [10]]
    println(numbers.windowed(3))
    //[[0, 1, 2], [1, 2, 3], [2, 3, 4], [3, 4, 5], [4, 5, 6], [5, 6, 7], [6, 7, 8], [7, 8, 9], [8, 9, 10]]
    println(numbers.windowed(3,step = 3))
    //[[0, 1, 2], [3, 4, 5], [6, 7, 8]]
    println(numbers.windowed(3,step = 3,partialWindows = true))
    //[[0, 1, 2], [3, 4, 5], [6, 7, 8], [9, 10]]
}