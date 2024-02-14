package baekjoon.dp

// boj 9095

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val testCase = br.readLine().toInt()
    val dp = Array(11) { 0 }
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    for (i in 4 until 11) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
    }

    repeat(testCase) {
        val n = br.readLine().toInt()
        bw.write("${dp[n]} \n")
    }

    bw.flush()
    bw.close()
}