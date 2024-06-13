package 구름.구현

import java.util.*

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val pq = PriorityQueue<Pair<Int, Int>>( { a,b -> a.second - b.second } )

    repeat (n) {
        val (s, e) = br.readLine().split(" ").map { it.toInt() }
        pq.offer(Pair(s,e))
    }

    var count = 1
    var end = pq.poll().second

    while (pq.size > 0) {
        if (pq.peek().first >= end + 1) {
            end = pq.poll().second
            count += 1
        } else {
            pq.poll()
        }
    }

    bw.write(count.toString())
    bw.flush()
    bw.close()

}