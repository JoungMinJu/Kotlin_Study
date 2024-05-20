package ch21_function

fun main() {

}

fun showMessage(message: String) {
    print(message)
}

fun getSum(x: Double, y: Double): Double {
    return x + y;
}

fun getMax(x:Int, y:Int): Int {
    return if (x>y) x else y
}

fun abs(num: Int): Int {
    return if (num < 0) -num else num
}

// [1] 기본 매개변수(선택적 매개변수) : 매개변수 선언과 동시에 초기화
fun log(message:String, level:Byte = 1) {
    print("$message, $level")
}

fun useLog() {
    log("디버그") // [A] 두 번째 매개변수 생략
    log("에러", 4) //[B] 전체 매개변수 사용
}

fun sum(first: Int, second: Int) {
    println(first + second)
}

fun userSum() {
    sum(10,20)
    sum(second = 20, first = 10)
}

fun sumAll(first:Int, second: Int): Int = first + second



