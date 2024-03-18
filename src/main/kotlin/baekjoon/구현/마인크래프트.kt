package baekjoon.구현

// boj 18111

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val input = br.readLine().split(" ").map { it.toInt() }
    val n = input[0]
    val m = input[1]
    val b = input[2]
    val board = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }

    var time = 0


}

