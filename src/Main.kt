
import kotlin.random.Random



fun main() {
    print("Введите длину пароля (минимум 6): ")
    var length = readln().toInt()
    if (length < 6) {
        println("Минимальная длина — 6. Будет использовано 6.")
        length = 6
    }
    val chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    var password = ""
    var hasDigit = false
    var hasLower = false
    var hasUpper = false
    while (!(hasDigit && hasLower && hasUpper)) {
        password = ""
        hasDigit = false
        hasLower = false
        hasUpper = false
        for (i in 1..length) {
            password = password + chars[Random.nextInt(chars.length)]
        }
        for (ch in password) {
            if (ch.isDigit()) hasDigit = true
            else if (ch.isLowerCase()) hasLower = true
            else if (ch.isUpperCase()) hasUpper = true
        }
    }

    println("Сгенерированный пароль: $password")
}