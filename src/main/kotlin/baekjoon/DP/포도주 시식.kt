package baekjoon.DP

// boj 2156

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val podo = IntArray(n) { br.readLine().toInt() }
    if (n == 1) {
        println(podo[0])
        return
    }

    /**
     * i 인덱스의 0번은 i 와인만 마셨을 때
     * i 인덱스의 1번은 i-1 와인을 마셨을 때
     * i 인덱스의 2번은 i-2 와인을 마셨을 때
     */
    val dp = Array(10001) { IntArray(3) }

    dp[0][0] = podo[0]
    dp[1][0] = podo[1]
    dp[1][1] = podo[0] + podo[1]

    for (i in 2 until n) {
        dp[i][0] = podo[i] + maxOf(dp[i - 2][0], dp[i - 2][1], dp[i - 2][2])
        dp[i][1] = podo[i] + dp[i - 1][0]
        dp[i][2] = maxOf(dp[i - 1][0], dp[i - 1][1], dp[i - 1][2])
    }

    val max = maxOf(dp[n - 1][0], dp[n - 1][1], dp[n - 1][2])
    bw.write(max.toString())
    bw.flush()
    bw.close()

}