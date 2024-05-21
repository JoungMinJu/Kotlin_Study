package ch25_enum

enum class Priority {
    High,
    Normal,
    Low
}

enum class Animal {
    Mouse, Cow, Tiger, Chicken, Dog, Pig
}

fun main() {
    println("${Priority.High}")

    var animal = Animal.Dog
    if (animal == Animal.Tiger) {
        println("호랑이")
    } else if (animal == Animal.Dog) {
        println("강아지")
    } else {
        println("없소")
    }

    // when 식과 사용
    var who = Animal.Pig
    var result = when(who) {
        Animal.Dog -> "강아지"
        Animal.Cow -> "소"
        Animal.Pig -> "돼지"
        else -> "다른 동물"
    }
    println(result)

}

