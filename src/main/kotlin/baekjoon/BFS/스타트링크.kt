package baekjoon.BFS

import java.util.*

// boj 5014

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (F, S, G, U, D) = br.readLine().split(" ").map { it.toInt() }
    var count = 0
    val isVisited = BooleanArray(F + 1)
    val queue: Queue<Int> = LinkedList()

    val buttons = mutableListOf(U, D)

    queue.offer(S)
    isVisited[S] = true

    while (queue.size > 0) {

        repeat(queue.size) {
            val front = queue.poll()

            if (front == G) {
                bw.write(count.toString())
                bw.flush()
                bw.close()
                return
            }

            repeat(2) {
                var operator = 1
                if (it == 1) operator = -1

                val target = front + buttons[it] * operator

                if (target in 1..F && !isVisited[target]) {
                    isVisited[target] = true
                    queue.offer(target)
                }
            }
        }
        count++
    }

    if (!isVisited[G]) {
        bw.write("use the stairs")
        bw.flush()
        bw.close()
    }

}