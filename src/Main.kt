//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.random.Random

fun main() {
    print("Введите число: ")
    val n = readln().toInt()
    for (i in 0..n step 2) {
        println(i)
    }
}