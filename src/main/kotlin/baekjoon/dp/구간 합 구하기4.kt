package baekjoon.dp

// boj 11659

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val numArr = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val dp = Array(n) { 0 }

    dp[0] = numArr[0]
    for (i in 1 until n) {
        dp[i] = dp[i - 1] + numArr[i]
    }

    repeat(m) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        if (i >= 2) {
            bw.write((dp[j - 1] - dp[i - 2]).toString())
        } else {
            bw.write(dp[j - 1].toString())
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()

}