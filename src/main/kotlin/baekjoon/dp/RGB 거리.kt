package baekjoon.dp

import kotlin.math.min

// boj 1149

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val price = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }
    val dp = Array(n) { IntArray(3) }

    dp[0][0] = price[0][0]
    dp[0][1] = price[0][1]
    dp[0][2] = price[0][2]

    for (i in 1 until n) {
        dp[i][0] = min(dp[i - 1][1], dp[i - 1][2]) + price[i][0]
        dp[i][1] = min(dp[i - 1][0], dp[i - 1][2]) + price[i][1]
        dp[i][2] = min(dp[i - 1][0], dp[i - 1][1]) + price[i][2]
    }

    bw.write(minOf(dp[n - 1][0], dp[n - 1][1], dp[n - 1][2]).toString())
    bw.flush()
    bw.close()

}