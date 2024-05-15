package ch14_when

fun main() {
    var first = 3
    var second = 5

    val max = if (first > second) first else second

    val maxValue = if (first > second) {
        println("first 선택")
        first
    } else {
        println("second 선택")
        second
    } // 출력하고 반환하는 것도 가능


}
