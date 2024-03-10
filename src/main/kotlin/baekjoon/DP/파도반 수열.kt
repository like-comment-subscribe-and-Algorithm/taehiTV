package baekjoon.DP

// boj 9461

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val testCase = br.readLine().toInt()
    val result = mutableListOf<Int>()

    repeat(testCase) {
        result.add(br.readLine().toInt())
    }

    val dp = LongArray(101)
    dp[1] = 1
    dp[2] = 1
    dp[3] = 1

    for (i in 4..100) {
        dp[i] = dp[i - 3] + dp[i - 2]
    }

    for (i in result) {
        bw.write("${dp[i]}\n")
    }

    bw.flush()
    bw.close()

}