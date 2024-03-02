package baekjoon.BFS

import java.util.*

// boj 1697

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (subin, bro) = br.readLine().split(" ").map { it.toInt() }
    val board = IntArray(200002) { 200002 }

    fun bfs(start: Int) {
        val queue: Queue<Int> = LinkedList()
        queue.offer(start)
        board[start] = 0

        while (queue.size > 0) {
            val front = queue.poll()

            if (front != 0 && board[front - 1] > board[front] + 1) {
                board[front - 1] = board[front] + 1
                queue.offer(front - 1)
            }

            if (front + 1 < 200002 && board[front + 1] > board[front] + 1) {
                board[front + 1] = board[front] + 1
                queue.offer(front + 1)
            }

            if (front * 2 < 200002 && board[front * 2] > board[front] + 1) {
                board[front * 2] = board[front] + 1
                queue.offer(front * 2)
            }
        }
    }

    bfs(subin)
    bw.write(board[bro].toString())
    bw.flush()
    bw.close()
}
