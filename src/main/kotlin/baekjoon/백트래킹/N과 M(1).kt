package baekjoon.백트래킹

// boj 15649

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val isUsed = BooleanArray(n + 1)
    val arr = IntArray(m + 1)

    fun backtracking(start: Int) {
        if (start == m) {
            for (i in 0 until m) {
                bw.write("${arr[i]} ")
            }
            bw.newLine()
            return
        }

        for (i in 1..n) {
            if (!isUsed[i]) {
                arr[start] = i
                isUsed[i] = true
                backtracking(start + 1)
                isUsed[i] = false
            }
        }

    }

    backtracking(0)
    bw.flush()
    bw.close()
}