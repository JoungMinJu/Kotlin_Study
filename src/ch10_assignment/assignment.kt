package ch10_assignment

fun main() {
    var name = "kotlin"
    var version = 1.4

    var i = 100
    var j = 200
    println("처음 $i, $j")

    var temp: Int = i
    i = j
    j = temp

    var num = 10
    num += 1
    num -= 1

    var num2 = -100
    ++num2
    println(num2) // -99
    --num2
    println(num2) // -100


}
