package baekjoon.dp

import kotlin.math.max

// boj 2579

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val stairCount = br.readLine().toInt()
    val stairScore = Array(stairCount + 1) { 0 }
    val dp = Array(stairCount + 1) { IntArray(3) }

    for (i in 1..stairCount) stairScore[i] = br.readLine().toInt()

    if (stairCount == 1) {
        bw.write(stairScore[1].toString())
        bw.flush()
        bw.close()
        return
    }

    dp[1][1] = stairScore[1]
    dp[1][2] = 0
    dp[2][1] = stairScore[2]
    dp[2][2] = stairScore[1] + stairScore[2]

    for (i in 3..stairCount){
        dp[i][1] = max(dp[i-2][1],dp[i-2][2]) + stairScore[i]
        dp[i][2] = dp[i-1][1] + stairScore[i]
    }

    bw.write(max(dp[stairCount][1], dp[stairCount][2]).toString())
    bw.flush()
    bw.close()

}