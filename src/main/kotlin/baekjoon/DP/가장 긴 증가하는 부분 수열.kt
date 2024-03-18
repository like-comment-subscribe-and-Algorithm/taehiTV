package baekjoon.DP

import kotlin.math.max

// boj 11053

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val dp = IntArray(1001) { 1 }

    for (i in 0 until n) {
        for (j in 0 until i) {
            if (arr[i] > arr[j]) {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
    }

    bw.write(dp.max().toString())
    bw.flush()
    bw.close()

}