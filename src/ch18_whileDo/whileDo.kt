package ch18_whileDo

fun main() {
    var count = 0

    while (count < 3) {
        println("하이요")
        count++
    }

    var first = 0
    var second = 1

    while (second <= 20) {
        println(second)
        val tmp = first + second
        first = second
        second = tmp
    }
    println()

    var cnt = 0
    do {
        println("hi")
        cnt++
    } while (cnt < 3)
}
