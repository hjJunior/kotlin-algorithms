fun main() {
    val array = arrayOf(1, 3, 4, 55, 104, 222, 229, 300).sortedArray()
    val key = 55
    
    val search = binarySearch(array, key)
    println(if(search == -1) "The $key is not in array" else "The $key is in $search index")
}

fun binarySearch(array: Array<Int>, key: Int): Int {
    var begin = 0
    var end = array.size-1
    
    while(begin <= end) {
        val middle = (begin + end)/2
        when {
            key == array[middle] -> return middle
            key > array[middle] -> begin = middle + 1
            else -> end = middle - 1
        }
    }
    
    return -1
}
