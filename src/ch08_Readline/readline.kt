package ch08_Readline

import java.util.*

fun main() {
    println(readLine())

    println("이름입력")
    var name = readLine()
    println("안녕하세요. ${name} 님")

    println("정수를 입력하세요 ")
    var tmp = readLine() ?: ""
    var intAge: Int = tmp.toIntOrNull() ?: 0

    println("실수를 입력하세요 ")
    val tmpWeight = readLine() ?: ""
    val weight: Double = tmpWeight.toDoubleOrNull() ?: 0.0

    // 스캐너 객체로 받기도 된다
    val scanner = Scanner(System.`in`)
    println("정수 : ")
    val number = scanner.nextInt()
    println("실수 : ")
    val real = scanner.nextDouble()

}
