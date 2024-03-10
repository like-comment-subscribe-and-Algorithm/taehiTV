package baekjoon.DP

// BOJ 1003

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val testCase = br.readLine().toInt()
    val dp = Array(41) { IntArray(2) }
    val result = IntArray(testCase)

    for (i in 0 until testCase) {
        val n = br.readLine().toInt()
        result[i] = n
    }

    val max = result.maxOrNull() ?: 0

    dp[0][0] = 1
    dp[0][1] = 0
    dp[1][0] = 0
    dp[1][1] = 1

    if (max >= 2) {
        for (i in 2..max) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0]
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1]
        }
    }

    for (i in result) {
        bw.write("${dp[i][0]} ${dp[i][1]}\n")
    }

    bw.flush()
    bw.close()
}