package 구름.구현

import java.util.LinkedList
import java.util.Queue

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val dx = intArrayOf(-1, 0, 0, 1)
    val dy = intArrayOf(0, 1, -1, 0)

    val n = br.readLine().toInt()
    val board = Array(n) { IntArray(n) }
    var count = 0

    for (i in 0 until n) {
        val input = br.readLine().split(" ").map { it.toInt() }
        for (j in 0 until n) {
            board[i][j] = input[j]
        }
    }

    fun bfs(x: Int, y: Int) {
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        queue.add(Pair(x, y))
        board[x][y] = 0

        while (queue.isNotEmpty()) {
            val (cx, cy) = queue.poll()

            for (i in 0 until 4) {
                val nx = cx + dx[i]
                val ny = cy + dy[i]

                if (nx in 0 until n && ny in 0 until n && board[nx][ny] == 1) {
                    board[nx][ny] = 0
                    queue.add(Pair(nx, ny))
                }
            }
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (board[i][j] == 1) {
                bfs(i, j)
                count += 1
            }
        }
    }

    bw.write(count.toString())
    bw.flush()
    bw.close()
}