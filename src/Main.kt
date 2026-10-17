//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


fun main() {
    print("Введите количество секунд: ")
    val seconds = readln().toInt()

    // for идёт от seconds вниз до 1 включительно
    for (remaining in seconds downTo 1) {
        println("Осталось секунд: $remaining")
        Thread.sleep(1000)   // пауза 1 секунда
    }
    println("Время вышло")
}