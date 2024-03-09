package baekjoon.DP

import kotlin.math.max

// boj 1912

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val dp = IntArray(n)

    dp[0] = arr[0]

    for (i in 1 until n) {
        dp[i] = max(dp[i - 1] + arr[i], arr[i])
    }

    bw.write(dp.max().toString())
    bw.flush()
    bw.close()

}