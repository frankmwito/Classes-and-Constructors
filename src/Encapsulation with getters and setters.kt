

class BanKAccount(
    val accountNumber: String,
    initialBalance: Double,
    val owner: String
){
    var balance: Double = initialBalance
        get() = field
        set(value) {
            require(value >=0) {"Balance cannot be negative"}
            field = value
        }
    init {
        require(balance >= 0) {"Initial balance cannot be negative"}
        println("initial balance: $balance")
    }
}

fun main() {
    val banKAccount = BanKAccount("134335", -325552.54, "Frank")
    println("current balance is ${banKAccount.balance}")
    try {
        banKAccount.balance = -100.0
    } catch (e: IllegalArgumentException){
        println(e.message)
    }
    println("updated balance: ${banKAccount.balance}")
}