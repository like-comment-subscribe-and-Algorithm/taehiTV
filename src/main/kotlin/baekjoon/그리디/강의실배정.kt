package baekjoon.그리디

import java.util.*

// boj 11000

fun main() {
    val n = readln().toInt()
    val arr = Array(n) { readln().split(" ").map { it.toInt() }.toIntArray() }

    arr.sortBy { it[0] }

    val pq = PriorityQueue<Int>()
    pq.offer(arr[0][1])

    for (i in 1 until n){
        if (pq.peek() <= arr[i][0]) {
            pq.poll()
        }
        pq.offer(arr[i][1])
    }

    println(pq.size)
}