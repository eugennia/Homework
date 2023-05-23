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
    println(" - result of 161 problem")

    print(problem161())
    println(" - result of 160 problem")

    print(problem162())
    println(" - result of 162 problem")

    print(problem163())
    println(" - result of 163 problem")

    print(problem164(inputNumber))
    println(" - result of 164 problem")

    print(problem165(inputNumber))
    println(" - result of 165 problem")

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

// TODO: fix 15 30 45 60 75 90 -388684592 - result of 156 problem
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

// TODO: fix -636245659 - result of 158 problem
fun problem158(): Int {
    var product: Int = 1
    for (i in 1 .. 999) {
        if (i % 2 != 0 && i % 3 != 0) {
            product *= i
        }
    }
    return product
}

// TODO: fix 0 - result of 159 problem
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
        for (j in 40 .. 127)
            if (i * 16 == j * j) {
                return i
            }
    }
    return 0
}

fun problem161(): Int {
    for (i in 1000..9999) {
        for (j in 161 .. 2600)
            if (i * 26 == j * j) {
                return i
            }
    }
    return 0
}

fun problem162(): Int {
    for (i in 9999 downTo 1000) {
        for (j in 1400 downTo  442)
            if (i * 14 == j * j) {
                return i
            }
    }
    return 0
}

fun problem163(): Int {
    for (i in 9999 downTo 1000) {
        for (j in 1800 downTo  570)
            if (i * 18 == j * j) {
                return i
            }
    }
    return 0
}

fun problem164(n: Int): Int {
    for (i in 100..999) {
        if (sqrt(i.toDouble()) > n) {
            return i
        }
    }
    return 0
}

fun problem165(n: Int): Boolean { // same as 180
    var number = n
    while (number % 3 == 0) {
        number /= 3
    }
    return number == 1
}

fun problem166(n: Int): Boolean {
    return false
}