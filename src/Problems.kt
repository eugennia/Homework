import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

fun main() {
    print("Please, input positive number: ")
    val inputNumber = Integer.valueOf(readlnOrNull())

//    print(problem151(inputNumber))
//    println(" - result of 151 problem")
//
//    print(problem152(inputNumber))
//    println(" - result of 152 problem")
//
//    print(problem153(inputNumber))
//    println(" - result of 153 problem")
//
//    print(problem154(inputNumber))
//    println(" - result of 154 problem")
//
//    print(problem155())
//    println(" - result of 155 problem")
//
//    print(problem156())
//    println(" - result of 156 problem")
//
//    print(problem157())
//    println(" - result of 157 problem")
//
//    print(problem158())
//    println(" - result of 158 problem")
//
//    print(problem159())
//    println(" - result of 159 problem")
//
//    print(problem160())
//    println(" - result of 161 problem")
//
//    print(problem161())
//    println(" - result of 160 problem")
//
//    print(problem162())
//    println(" - result of 162 problem")
//
//    print(problem163())
//    println(" - result of 163 problem")
//
//    print(problem164(inputNumber))
//    println(" - result of 164 problem")
//
//    print(problem165(inputNumber))
//    println(" - result of 165 problem")

//    print(problem166(inputNumber))
//    println(" - result of 166 problem")
//
//    print(problem167(inputNumber))
//    println(" - result of 167 problem")

//    print(problem168(inputNumber))
//    println(" - result of 168 problem")

//    print(problem169(inputNumber, 5))
//    println(" - result of 169 problem")

//    print(problem170(inputNumber))
//    println(" - result of 170 problem")

//    print(problem171(inputNumber))
//    println(" - result of 171 problem")

//    print(problem172(inputNumber))
//    println(" - result of 172 problem")

//    print(problem173(inputNumber, 4f, 19f))
//    println(" - result of 173 problem")

//    print(problem174(inputNumber))
//    println(" - result of 174 problem")

//    print(problem179(inputNumber, 5))
//    println(" - result of 179 problem")

    print(problem180(inputNumber))
    println(" - result of 180 problem")
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
    for (i in 1..999) {
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
        for (j in 40..127)
            if (i * 16 == j * j) {
                return i
            }
    }
    return 0
}

fun problem161(): Int {
    for (i in 1000..9999) {
        for (j in 161..2600)
            if (i * 26 == j * j) {
                return i
            }
    }
    return 0
}

fun problem162(): Int {
    for (i in 9999 downTo 1000) {
        for (j in 1400 downTo 442)
            if (i * 14 == j * j) {
                return i
            }
    }
    return 0
}

fun problem163(): Int {
    for (i in 9999 downTo 1000) {
        for (j in 1800 downTo 570)
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

fun problem166(n: Int): Int {
    var number = n
    while (number % 4 == 0) {
        number /= 4
    }
    return if (number == 1) {
        val y = 1
        y
    } else {
        val y = 0
        y
    }
}

//fun problem167(x: Int): Boolean {
//    val range = 1..30
//    var y = false
//    range.forEach {
//        y = sin(x.toFloat().pow(it)) < 0
//        if (y) return y
//    }
//    return y
//}

fun problem167(x: Int): Boolean =
    (1..30).any {
        sin(x.toFloat().pow(it)) < 0
    }

fun problem168(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2 until n) {
        for (j in 2 until n) {
            if (i * j == n) {
                return true
            }
        }
    }
    return false
}

fun problem169(a: Int, b: Int): Int {
    if (a <= 0 || b <= 0) return 6
    for (i in 2 until a + b) {
        for (j in 2 until a + b) {
            if (i * j == a + b) {
                return 5
            }
        }
    }
    return 6
}

fun problem170(n: Int): Int {
    if (n <= 0) return -1
    for (i in n + 1..n * n) {
        var number = i
        while (number % 2 == 0) {
            number /= 2
        }
        if (number == 1) {
            return i
        }
    }
    return -1
}

fun problem171(n: Int): Int {
    if (n <= 0) return -1
    var sum = 1
    for (i in n downTo 1) {
        sum *= i
    }
    return sum
}

fun problem172(n: Int): Int {
    if (n <= 0) return -1
    var sum = 1
    for (i in n downTo 1 step 2) {
        sum *= i
    }
    return sum
}

fun problem173(n: Int, a: Float, b: Float): Float {
    if (n < 1 || a > b) return -1f
    val h = (b - a) / n
    repeat(n) { next ->
        print(a + next * h)
        print(" ")
    }
    print(b)
    println()

    return h
}

// TODO fix later
//fun problem174(n: Int): Int {
//    var list = mutableListOf<Int>()
//    list.add(2)
//    for (i in n downTo 1) {
//        list.add(2 + 1 / problem174(n - 1))
//    }
//    return list.last()
//}

fun problem179(n: Int, k: Int): String {
    var N = n
    var count = 0
    if (n < k) return ""
    while (N >= k) {
        N -= k
        count++
    }
    return "$n divided by $k is $count, remainder is $N"
}

fun problem180(n: Int): Boolean { // same as 165
    var number = n
    while (number % 3 == 0) {
        number /= 3
    }
    return number == 1
}

fun problem185(p: Int) {
    if (p !in 1 until 25) {
        println("Wrong percent")
        return
    }
    var x = 30_000
    var m = 0;

    do {
        x += x * p / 100
        m++
    } while (x < 100_000)

    println("Total $x AMD in $m months")

//    """
//        Total $x AMD
//        in $m months
//    """
}

//fun problem188(x: Int): Int {
//
//}

fun fib(x: Int): Int {
    if (x <= 1) return 1
    return fib(x - 2) + fib(x - 1)
}


