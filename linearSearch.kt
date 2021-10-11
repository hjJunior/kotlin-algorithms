fun main() {
    val myList = listOf("lets", "find", "something", "in", "my", "list")
    val keyToSearch = "something"

    myList.forEachIndexed { index, word -> 
        if (word == keyToSearch) {
            println("$keyToSearch is in $index index")
        }
    }
}