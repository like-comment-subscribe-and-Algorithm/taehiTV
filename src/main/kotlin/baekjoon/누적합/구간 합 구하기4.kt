package baekjoon.누적합

import java.util.*

// boj 11659

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val prefixSum = IntArray(n + 1)

    val st = StringTokenizer(br.readLine())

    for (i in 1..n) {
        prefixSum[i] = prefixSum[i - 1] + st.nextToken().toInt()
    }

    repeat(m) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        bw.write("${(prefixSum[j] - prefixSum[i - 1])}\n")
    }
    bw.flush()
    bw.close()

}