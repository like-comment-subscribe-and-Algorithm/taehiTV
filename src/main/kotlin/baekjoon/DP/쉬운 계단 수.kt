package baekjoon.DP

// boj 10844

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val dp = Array(101) { IntArray(10) }
    var result = 0

    dp[1][0] = 0
    for (i in 1..9) dp[1][i] = 1

    for (i in 2..n) {
        for (j in 1..8) {
            dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000
        }
        dp[i][0] = dp[i - 1][1]
        dp[i][9] = dp[i - 1][8]
    }

    for (i in 0..9) {
        result = (result + dp[n][i]) % 1000000000
    }

    bw.write(result.toString())
    bw.flush()
    bw.close()

}