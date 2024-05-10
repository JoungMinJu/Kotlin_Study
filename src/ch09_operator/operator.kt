package ch09_operator

fun main() {
    println(3 + 5)
    println(3 - 5)
    println(3 * 5)
    println(3 / 5)
    println(3 % 5)

    var value: Int = 0
    value = 8
    value = +value // 걍 의미 없음
    value = -value // 부호 바뀌겄지

    var number: Int = 3.14.toInt()
    println(number) // -> 3

    var days = 29
    println("2월달은 " + days + "일입니다.") // 암시적
    println("2월달은 " + days.toString() + "일입니다") // 명시적
    println("2월달은 ${days}일입니다") // (젤 선호됨) 템플릿 문자열


}
