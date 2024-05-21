package ch27_string

fun main() {
    println("""
        
        안녕하시요.
        반갑습니다.
        또 만나쇼
        
    """)

    var message = "hello, world"

    println(message.length)
    println(message.uppercase())

    println(message
        .replace("hello", "안녕하세요"))
    println("안녕".plus("").plus("하세요."))

    var src = "Red,Green,Blue"
    var colors = src.split(",")
    for (color in colors) {
        println(color)
    }

    var sb = StringBuilder()
    sb.append("January\n")
    sb.append("Feburary\n")

    println(sb.toString())

}
