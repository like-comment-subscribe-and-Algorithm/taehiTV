package baekjoon.비트마스킹

import kotlin.math.abs

// boj 2961

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val arr = Array(n) { Pair(0, 0) }
    var min = Int.MAX_VALUE

    for (i in 0 until n) {
        val (s, b) = br.readLine().split(" ").map { it.toInt() }
        arr[i] = Pair(s, b)
    }

    for (i in 1 until (1 shl n)) {
        var sour = 1
        var bitter = 0

        for (j in 0 until n) {
            if (i and (1 shl j) != 0) {
                sour *= arr[j].first
                bitter += arr[j].second
            }
        }

        val differ = abs(sour - bitter)

        if (differ < min) min = differ
    }

    bw.write(min.toString())
    bw.flush()
    bw.close()
}