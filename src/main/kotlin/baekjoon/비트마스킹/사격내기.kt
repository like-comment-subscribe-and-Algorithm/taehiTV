package baekjoon.비트마스킹

// boj 27960

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    bw.write((a xor b).toString())
    bw.flush()
    bw.close()

}