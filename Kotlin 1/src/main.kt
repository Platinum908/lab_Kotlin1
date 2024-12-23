fun sumElements(arr: Array<Int>): Int {
    var sum = 0
    for (i in arr.indices) {
        if ((i + 1) % 2 == 0) {
            sum += arr[i]
        }
    }
    return sum
}

fun avProfit(storeProfits: Array<Array<Int>>, storeIndex: Int): Double {
    val monthlyProfits = storeProfits[storeIndex]
    val totalProfit = monthlyProfits.sum()
    return totalProfit.toDouble() / monthlyProfits.size
}

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Сумма 2,4,6 и тд элементов: ${sumElements(array)}")

    val storesProfit = arrayOf(
        arrayOf(1000, 2000, 1500, 1200, 1300, 1400, 1600, 1700, 1800, 1900, 2100, 2200),
        arrayOf(1100, 2100, 1600, 1300, 1200, 1500, 1400, 1800, 1700, 1900, 2200, 2300),
        arrayOf(5000, 700, 1600, 1300, 1200, 2000, 900, 800, 11000, 7000, 2200, 2300),
        arrayOf(1100, 2100, 600, 300, 200, 1500, 800, 1800, 1700, 1900, 2200, 2300),
        arrayOf(100, 2100, 1600, 9000, 1200, 1500, 9000, 1800, 1700, 1900, 2200, 2300),
        arrayOf(1100, 2100, 12000, 500, 1200, 1500, 1400, 10000, 1700, 1900, 15000, 2300),
        arrayOf(5500, 800, 3500, 1300, 9800, 1500, 1400, 1800, 13500, 1900, 2200, 2300),
        arrayOf(5000, 2100, 4000, 1300, 6000, 1500, 7000, 1800, 3000, 1900, 2200, 2300),
        arrayOf(500, 2100, 4000, 1300, 600, 1500, 1400, 700, 1700, 1900, 200, 2300),
        arrayOf(1100, 2100, 0, 1300, 0, 200, 100, 1800, 1700, 1900, 2200, 2300),
    )
    print("Введите номер магазина (от 0 до 9): ")
    val storeIndex = readln().toInt()
    val averageProfit = avProfit(storesProfit, storeIndex)
    println("Среднемесячный доход магазина ${storeIndex}: $averageProfit")

}


