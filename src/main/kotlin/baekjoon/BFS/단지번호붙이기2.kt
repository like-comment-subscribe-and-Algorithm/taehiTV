package baekjoon.BFS

import java.util.*

// boj 2667

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val dx = intArrayOf(-1, 0, 0, 1)
    val dy = intArrayOf(0, -1, 1, 0)

    val n = br.readLine().toInt()
    val board = Array(n) { IntArray(n) }
    for (i in 0 until n) {
        val input = br.readLine()
        for (j in 0 until n) {
            board[i][j] = input[j] - '0'
        }
    }

    val houseCount = mutableListOf<Int>()

    fun bfs(x: Int, y: Int): Int {
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        var count = 1
        queue.offer(Pair(x, y))
        board[x][y] = 0

        while (queue.size > 0) {
            val front = queue.poll()
            repeat(4) {
                val nx = front.first + dx[it]
                val ny = front.second + dy[it]

                if (nx in 0 until n && ny in 0 until n) {
                    if (board[nx][ny] == 1) {
                        board[nx][ny] = 0
                        count++
                        queue.offer(Pair(nx, ny))
                    }
                }
            }
        }

        return count
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (board[i][j] == 1) {
                houseCount.add(bfs(i, j))
            }
        }
    }

    houseCount.sort()
    bw.write(houseCount.size.toString())
    bw.newLine()
    for (i in 0 until houseCount.size) bw.write("${houseCount[i]}\n")
    bw.flush()
    bw.close()
}