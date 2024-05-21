package ch29_exception

fun main() {
    try {
        var arr = arrayOf(1, 2)
        arr[100] = 1234
    }
    catch (ex: Exception) {
        println("에러가 발생했습니다.")
        println("예외 메세지 : ${ex.message}")
    }

}

fun main2() {
    var a = 3
    var b = 0
    var r = 0

    try {
        r = a / b
    } catch(e: Exception) {
        println("에러 발생: ${e.message}")
    }

    try {
        throw Exception("내가 만든 에러")
    } catch (ex: Exception) {
        println("에러 발생 : ${ex.message}")
    } finally {
        println("마무리")
    }
}
