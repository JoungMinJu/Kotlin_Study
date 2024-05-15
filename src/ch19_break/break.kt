package ch19_break

fun main() {
    for (i in 0 until 5) {
        if (i >= 0){
            break
        }
    }

    var number = 0
    while (true) {
        println("${++number}")
        if (number >= 5) {
            break
        }
    }

    var goal = 22
    var sum = 0

    var i = 1
    while (i <= 10) {
        sum += i
        if (sum >= goal) {
            break
        }
        i++
    }

    var count = 1
    loop@ for (i in 1 ..100){
        for (j in 1..100) {
            println("안녕")
            if (count >= 5) {
                break@loop
            }
        }
    }
    println()
}
