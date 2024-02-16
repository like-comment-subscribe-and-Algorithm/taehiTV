package baekjoon.DP

// boj 1904

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val dp = Array(n + 1) { 0 }

    dp[1] = 1

    if (n >= 2) {
        dp[2] = 2
        if (n >= 3) {
            for (i in 3..n) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 15746
            }
        }
    }

    bw.write(dp[n].toString())
    bw.flush()
    bw.close()
}

