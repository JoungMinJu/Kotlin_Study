package ch26_class

class ClassNote {

    fun run() {
        println("classNote의 run")
    }
}

data class Customer(val id: Int, val name: String, val city: String)
fun main() {
    var classNote = ClassNote()

    val customer = Customer(id=1, name ="홍길동", city = "서울")
    println("${customer.id}, ${customer.name}")

    var customers = arrayOf(
        Customer(1, "홍길동", "서울"),
        Customer(2, "백두산", "평양")
    )

    for (cust in customers) {
        println("번호 : ${cust.id}, 이름: ${cust.name}, 사는 곳 : ${cust.city}")
    }

}
