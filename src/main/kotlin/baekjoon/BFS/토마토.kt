package baekjoon.BFS

// boj 7576

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val dx = intArrayOf(-1, 0, 0, 1)
    val dy = intArrayOf(0, -1, 1, 0)

    val (m, n) = br.readLine().split(" ").map { it.toInt() }
    val box = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }

    val queue: Queue<Pair<Int, Int>> = LinkedList()
    val dist = Array(n) { IntArray(m) { -1 } }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (box[i][j] == 1) {
                queue.offer(Pair(i, j))
                dist[i][j] = 0
            }
        }
    }

    while (queue.size > 0) {
        val front = queue.poll()
        repeat(4) {
            val x = front.first + dx[it]
            val y = front.second + dy[it]

            if (x in 0 until n && y in 0 until m) {
                if (box[x][y] == 0) {
                    box[x][y] = 1
                    dist[x][y] = dist[front.first][front.second] + 1
                    queue.offer(Pair(x, y))
                }
            }
        }
    }

    if (box.any { it.any { tomato -> tomato == 0 } }) bw.write("-1")
    else bw.write(dist.maxOf { it.max() }.toString())

    bw.flush()
    bw.close()

}