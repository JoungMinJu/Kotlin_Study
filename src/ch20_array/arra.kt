package ch20_array

fun main() {
    var arr = "kotlin"
    println(arr[0]) // 'k'

    var numberss = arrayOf(3840, 2160)
    println("$numberss[0] * $numberss[1]}") // [Ljava.lang.Integer;@85ede7b[0] * [Ljava.lang.Integer;@85ede7b[1]}
    println("${numberss[0]} * ${numberss[1]}") // 3840 * 2160 (값을 출력하는 {})

    var phones = arrayOf("112", "119")
    for (phone in phones) {
        println(phone)
    }

    var languages = arrayOf("korean", "english", "spanish")
    languages[1] = "영어"

    var numbers: IntArray = intArrayOf(1, 2, 3)
    for (number in numbers) {
        println(numbers)
    }

    var floats = floatArrayOf(1.1f, 2.2f, 3.3f, 4.4f)
    for (float in floats) {
        println(float)
    }

    var favorites = arrayListOf<String>("C", "java", "kotlin")
    for (favorite in favorites) {
        println(favorite)
    }

    var arr2 = IntArray(3)
    arr2[0] = 11
    arr2[1] = 22
    arr2[2] = 33

    var index = 0
    println(arr2[index++])
    println(arr2[index++])
    println(arr2[index++])
}
