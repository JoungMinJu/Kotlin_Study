package ch14_when

fun main() {
    var x = 2

    when (x) {
        1 -> println("1입니다")
        2 -> println("2입니다")
        else -> {
            println("1과 2가 아닙니다.")
        }
    }
}

fun other() {
    println("가장 좋아하는 프로그래밍 언어는?")
    println("1. c언어 \t")
    println("2. c++언어 \t")
    println("3. c#언어 \t")
    println("4. Java언어 \t")
    println("5. kotlin언어 \t")

    val choice = (readLine() ?: "").toIntOrNull() ?: 0

    when (choice) {
        1, 2 -> println("c/c++ 선택")
        in 3..4 -> println("c#/java 선택")
        else -> println("코틀린 선택")
    }


}
