package baekjoon.DP

// boj 11057

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val dp = Array(n + 1) { IntArray(10) }

    for (i in 0 until 10) dp[1][i] = 1
    if (n == 1) {
        println(10)
        return
    }

    for (i in 2..n) {
        for (j in 0 until 10) {
            for (k in 0..j) {
                dp[i][j] = (dp[i][j] + dp[i - 1][k]) % 10007
            }
        }
    }

    var sum = 0
    for (i in 0 until 10) sum = (sum + dp[n][i]) % 10007
    bw.write(sum.toString())
    bw.flush()
    bw.close()
}
