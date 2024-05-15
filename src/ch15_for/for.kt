package ch15_for

fun main() {
    for(i in 0..2) {
        println("출력")
    }

    for (i in 1..3) {
        println("반갑쇼")
    }

    for (i in 1..5) {
        println(i)
    }

    for (i in 1..5 step 2) { // 잘 안쓴디야
        print("$i\t")
    }
    println()

    for (i in 5 downTo 1) {
        print(i)
    }
    println()

    for (i in 6 downTo 1 step 2) {
        print(i)
    }
    println()

    for(i in 1 until 5) { // .. 이랑 범위에서 차이
        print(i)
    }
    println()

    for (c in "Helloworld") {
        print("$c\t")
    }
    println()

    for ((index, value) in "Hello".withIndex()) {
        print("$index : $value\n")
    }

    var n = 3
    var sum = 0

    for (i in 1 .. n) {
        sum += i
    }
    println("sum : $sum")

    var n2 = 5
    var sum2 = 0
    for (i in 1 ..  n2) {
        if (i % 2 == 0) {
            sum2 += i
        }
    }
    println("1부터 ${n2}까지 짝수의 합 : $sum")

    for (row in 1 .. 5) {
        for (col in 1 .. 5) {
            print("*")
        }
        println()
    }

    for (row in 1 .. 5) {
        for (col in 1 .. row) {
            print("*")
        }
        println()
    }

    var n3 = 4
    var fact = 0
    for  (i in 1..n3) {
        print("${i}! -> ")
        fact = 1
        for (j in 1..i) {
            fact *= j
        }
        println("$fact")
    }
}

