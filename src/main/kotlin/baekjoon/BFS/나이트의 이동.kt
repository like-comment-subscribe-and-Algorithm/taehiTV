package baekjoon.BFS

import java.util.*

// boj 7562

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val dx = intArrayOf(2, 2, 1, 1, -1, -1, -2, -2)
    val dy = intArrayOf(1, -1, 2, -2, 2, -2, 1, -1)

    val testCase = br.readLine().toInt()

    repeat(testCase) {
        val boardLength = br.readLine().toInt()
        val (startX, startY) = br.readLine().split(" ").map { it.toInt() }
        val (targetX, targetY) = br.readLine().split(" ").map { it.toInt() }
        val board = Array(boardLength) { IntArray(boardLength) }
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        var breakpoint = true
        queue.offer(Pair(startX, startY))

        if (startX == targetX && startY == targetY) {
            bw.write("0\n")
            breakpoint = false
        }

        while (breakpoint) {
            val front = queue.poll()

            repeat(8) {
                val nx = front.first + dx[it]
                val ny = front.second + dy[it]

                if (nx in 0 until boardLength && ny in 0 until boardLength && board[nx][ny] == 0) {
                    if (nx == targetX && ny == targetY) {
                        bw.write("${board[front.first][front.second] + 1}\n")
                        breakpoint = false
                    } else {
                        queue.offer(Pair(nx, ny))
                        board[nx][ny] = board[front.first][front.second] + 1
                    }
                }
            }
        }
    }

    bw.flush()
    bw.close()

}