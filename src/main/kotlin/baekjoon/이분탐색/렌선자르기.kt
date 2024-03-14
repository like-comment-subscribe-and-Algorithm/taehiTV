package baekjoon.이분탐색

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (k, n) = br.readLine().split(" ").map { it.toInt() }

    val arr = LongArray(k) { br.readLine().toLong() }
    var start = 0L
    var end = arr.max() + 1

    while (start + 1 < end) {
        var lan = 0L
        val length = (start + end) / 2

        for (i in arr) {
            lan += i / length
        }

        if (lan >= n) start = length
        else end = length
    }

    bw.write(start.toString())
    bw.flush()
    bw.close()

}