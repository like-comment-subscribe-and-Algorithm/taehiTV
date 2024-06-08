package baekjoon.구현

// boj 17298

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine()
    val arr = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val stack = Stack<Int>()
    val answer = IntArray(arr.size)

    for (i in arr.size - 1 downTo 0) {
        var flag = true

        while (flag) {
            if (stack.isEmpty()) {
                stack.push(arr[i])
                flag = false
                answer[i] = -1
            } else if (stack.peek() > arr[i]) {
                answer[i] = stack.peek()
                flag = false
                stack.push(arr[i])
            } else {
                stack.pop()
            }
        }
    }

    for (i in answer.indices) {
        bw.write("${answer[i]} ")
    }

    bw.flush()
    bw.close()

}