fun main() {
    val word1 = "miosfehfioe"
    val word2 = "mmaaaaaaaaaaaa"
//    println(word)

//    println(problem646("adddaa"))
//    println(" - result of 646 problem")

//    println(problem647("abcba"))
//    println(" - result of 647 problem")

//    println(problem648("ab0c0defx1loi0wert0w3tg0opo"))
//    println(" - result of 648 problem")

//    println(problem649("576z45678zyui"))
//    println(" - result of 649 problem")

    println(problem650(10, word1, word2))
    println(" - result of 650 problem")
}

fun getRandomString(length: Int): String {
    val allowedChars = ('a'..'z')
    return (1..length).map { allowedChars.random() }.joinToString("")
}

fun problem646(word: String): Int {
    val count = word.filter {
        it == 'a'
    }.length
    return count
}

fun problem647(word: String): Boolean {
    var count = 0
    for (i in 0..word.lastIndex / 2) {
        if (word[i] == word[word.lastIndex - i]) {
            count++
        }
    }
    return count >= word.length / 2
}

fun problem648(word: String): Int {
    val index = word.indexOf("x")
    val newWord = word.substring(index, word.length)
    return newWord.filter {
        it == '0'
    }.length
}

fun problem649(word: String): Int {
    val firstIndex = word.indexOfFirst { it == 'z' }
    val lastIndex = word.indexOfLast { it == 'z' }
    return lastIndex - 1 - firstIndex
}

fun problem650(length: Int, word1: String, word2: String): Int {
    println(word1)
    println(word2)
    var result = 0
    for (c1 in word1) {
        for (c2 in word2) {
            if (c1 == c2)
                result++
        }
    }
    return result
}