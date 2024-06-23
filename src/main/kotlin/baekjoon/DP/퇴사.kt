package baekjoon.DP

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    var arr = Array(n) { br.readLine().split(" ").map { it.toInt() } }
    val dp = IntArray(n + 1)

    for (i in 0 until n) {
        if (i + arr[i][0] <= n) {
            if (i > 0) dp[i] = maxOf(dp[i], dp[i - 1])
            dp[i + arr[i][0]] = maxOf(dp[i + arr[i][0]], dp[i] + arr[i][1])
        }
    }

    bw.write(dp.maxOrNull()!!.toString())
    bw.flush()
    bw.close()
}