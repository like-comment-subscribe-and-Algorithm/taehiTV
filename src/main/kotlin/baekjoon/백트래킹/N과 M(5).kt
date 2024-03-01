package baekjoon.백트래킹

// boj 15651

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = IntArray(m)
    val board = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val isUsed = BooleanArray(10001)

    board.sort()

    fun dfs(start: Int) {
        if (start == m) {
            for (i in 0 until m) bw.write("${arr[i]} ")
            bw.newLine()
            return
        }

        for (i in board) {
            if (!isUsed[i]) {
                arr[start] = i
                isUsed[i] = true
                dfs(start + 1)
                isUsed[i] = false
            }
        }
    }

    dfs(0)
    bw.flush()
    bw.close()

}