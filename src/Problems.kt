import kotlin.math.sqrt

fun main() {
    print("Please, input positive number: ")
    val inputNumber = Integer.valueOf(readlnOrNull())

    print(problem151(inputNumber))
    println(" - result of 151 problem")

    print(problem152(inputNumber))
    println(" - result of 152 problem")

    print(problem153(inputNumber))
    println(" - result of 153 problem")

    print(problem154(inputNumber))
    println(" - result of 154 problem")

    print(problem155())
    println(" - result of 155 problem")

    print(problem156())
    println(" - result of 156 problem")

    print(problem157())
    println(" - result of 157 problem")

    print(problem158())
    println(" - result of 158 problem")

    print(problem159())
    println(" - result of 159 problem")

    print(problem160())
    println(" - result of 160 problem")

}

fun problem151(number: Int): Int {
    var sum: Int = 0
    for (i in number downTo 1) {
        if (number % i == 0) {
            sum += i
        }
    }
    return sum
}

fun problem152(number: Int): Int {
    var product: Int = 1
    for (i in number downTo 1) {
        if (number % i == 0) {
            product *= i
        }
    }
    return product
}

fun problem153(number: Int): Int {
    var sum: Int = 0
    for (i in number downTo 1) {
        if (number % i == 2) {
            sum += i
        }
    }
    return sum
}

fun problem154(number: Int): Int {
    var product: Int = 1
    for (i in number downTo 1) {
        if (number % i == 3) {
            product *= i
        }
    }
    return product
}

fun problem155(): Int {
    var sum: Int = 0
    for (i in 0..99) {
        if (i % 3 == 0) {
            print("$i ")
            sum += i
        }
    }
    return sum
}

fun problem156(): Int {
    var product: Int = 1
    for (i in 1..99) {
        if (i % 3 == 0 && i % 5 == 0) {
            print("$i ")
            product *= i
        }
    }
    return product
}

fun problem157(): Int {
    var sum: Int = 0
    for (i in 1..999) {
        if (i % 5 != 0) {
            print("$i ")
            sum += i
        }
    }
    return sum
}

fun problem158(): Int {
    var product: Int = 1
    for (i in 1 .. 999) {
        if (i % 2 != 0 && i % 3 != 0) {
            product *= i
        }
    }
    return product
}

fun problem159(): Int {
    var product: Int = 1
    for (i in 1..999) {
        if (i % 3 == 1 && i % 4 == 2) {
            print("$i ")
            product *= i
        }
    }
    return product
}

fun problem160(): Int {
    for (i in 100..999) {
        for (j in 1600 .. 15984)
        if (i * 16 == sqrt(j.toDouble()).toInt()) {
            return i
        }
    }
    return 0
}