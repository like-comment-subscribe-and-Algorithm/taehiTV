package 구름.구현

import java.util.*

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val dx = intArrayOf(-1, 0, 0, 1)
    val dy = intArrayOf(0, -1, 1, 0)

    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val board = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }
    val houseCount = IntArray(31)
    val queue : Queue<Pair<Int, Int>> = LinkedList()
    var result : Pair<Int, Int> = Pair(0, 0)

    fun bfs(x: Int, y: Int): Int {
        var count = 1
        val m = board[x][y]

        queue.offer(Pair(x, y))
        board[x][y] = 0

        while (queue.size > 0) {
            val front = queue.poll()

            repeat (4) {
                val nx = front.first + dx[it]
                val ny = front.second + dy[it]

                if (nx in 0 until n && ny in 0 until n && board[nx][ny] == m) {
                    board[nx][ny] = 0
                    queue.offer(Pair(nx, ny))
                    count += 1
                }
            }
        }

        return count
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            val houseNumber = board[i][j]

            if (houseNumber != 0) {
                if (bfs(i, j) >= k) {
                    houseCount[houseNumber] += 1
                    if (result.second == houseCount[houseNumber]) {
                        if (result.first < houseNumber) {
                            result = Pair(houseNumber, houseCount[houseNumber])
                        }
                    } else if (result.second < houseCount[houseNumber]) {
                        result = Pair(houseNumber, houseCount[houseNumber])
                    }
                }
            }
        }
    }

    bw.write(result.first.toString())
    bw.flush()
    bw.close()

}