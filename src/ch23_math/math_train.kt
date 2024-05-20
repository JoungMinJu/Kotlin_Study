package ch23_math

import kotlin.math.*

fun main() {
    // [1] 수학 관련 함수
    println("자연 로그 : ${E}")
    println("원주율(PI) : $PI")

    // [2] 절댓값
    println("-10의 절댓값 : ${abs(-10)}")

    println(max(3, 5))
    println(min(3, 5))

    println("거듭제곱 : 2의 10승 : ${2.0.pow(10)}")

    println(round(1.5))
    println("%.3f".format(3.1516))

}
