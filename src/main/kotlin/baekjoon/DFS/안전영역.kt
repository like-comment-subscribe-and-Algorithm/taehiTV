package baekjoon.DFS

import kotlin.math.max

// boj 2468

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val dx = intArrayOf(-1, 0, 0, 1)
    val dy = intArrayOf(0, -1, 1, 0)

    val n = br.readLine().toInt()
    val board = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }

    var result = 0

    fun checkBoard(height: Int) {
        val isVisited = Array(n) { BooleanArray(n) }
        var count = 0

        fun dfs(startX: Int, startY: Int) {
            isVisited[startX][startY] = true
            repeat(4) {
                val nx = startX + dx[it]
                val ny = startY + dy[it]

                if (nx in 0 until n && ny in 0 until n) {
                    if (board[nx][ny] > height && !isVisited[nx][ny]) {
                        dfs(nx, ny)
                    }
                }
            }
        }


        for (i in 0 until n) {
            for (j in 0 until n) {
                if (!isVisited[i][j] && board[i][j] > height) {
                    dfs(i, j)
                    count++
                }
            }
        }

        result = max(result, count)
    }

    for (i in 0..100) {
        checkBoard(i)
    }

    bw.write(result.toString())
    bw.flush()
    bw.close()
}