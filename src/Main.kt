//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.random.Random

fun main() {
    while (true) {
        val code = Random.nextInt(1000, 10000)
        println("Ваш код авторизации: $code")

        print("Введите код для авторизации: ")
        val input = readln().toInt()

        if (input == code) {
            println("Добро пожаловать!")
            return
        }
        println("Неверный код. Отправляем новый код...")
    }
}