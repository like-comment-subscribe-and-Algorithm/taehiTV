package baekjoon.그리디

// boj 11047

fun main() {
    var (coinTypeCount, sum) = readln().split(" ").map { it.toInt() }
    val coinArr = Array(coinTypeCount) { readln().toInt() }
    var coinCount = 0

    for (i in coinTypeCount - 1 downTo 0) {
        val coin = coinArr[i]
        if ((sum / coin) >= 1) {
            coinCount += sum / coin
            sum %= coin
        }
    }

    println(coinCount)
}