package baekjoon.BFS

import java.util.*
import kotlin.math.max

// boj 1926

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val dx = intArrayOf(0, 1, -1, 0)
    val dy = intArrayOf(1, 0, 0, -1)

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val canvas = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }

    var paintCount = 0
    var maxSize = 0

    fun bfs(x: Int, y: Int): Int {
        var count = 1
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        queue.offer(Pair(x, y))

        // 시작 지점 방문 표시
        canvas[x][y] = 0

        while (queue.size > 0) {
            val front = queue.poll()
            repeat(4) {
                val x = front.first + dx[it]
                val y = front.second + dy[it]

                if (x in 0 until n && y in 0 until m) {
                    if (canvas[x][y] == 1) {
                        canvas[x][y] = 0
                        queue.offer(Pair(x, y))
                        count++
                    }
                }
            }
        }
        return count
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (canvas[i][j] == 1) {
                maxSize = max(maxSize, bfs(i, j))
                paintCount++
            }
        }
    }

    bw.write("$paintCount\n$maxSize")
    bw.flush()
    bw.close()

}