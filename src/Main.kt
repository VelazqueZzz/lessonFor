//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.random.Random


fun main() {
    val letters = 'a'..'z'
    val digits = '0'..'9'
    var password = ""
    for (i in 1..3) {
        password = password + letters.random() + digits.random()
    }
    println("Сгенерированный пароль: $password")
}