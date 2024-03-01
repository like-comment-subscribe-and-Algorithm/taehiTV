package baekjoon.백트래킹

// boj 15656

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = IntArray(m)
    val board = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    board.sort()

    fun dfs(start: Int) {
        if (start == m) {
            for (i in 0 until m) bw.write("${arr[i]} ")
            bw.newLine()
            return
        }

        for (i in board) {
            arr[start] = i
            dfs(start + 1)
        }
    }

    dfs(0)
    bw.flush()
    bw.close()

}