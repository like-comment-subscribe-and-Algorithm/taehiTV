package baekjoon.백트래킹


// boj 18429

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val kits = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val isUsed = BooleanArray(n)
    var count = 0

    fun backtracking(newWeight: Int, num: Int) {
        if (num == n) {
            count++
            return
        }

        for (i in 0 until n) {
            val tempWeight = newWeight - k + kits[i]
            if (!isUsed[i] && tempWeight >= 500) {
                isUsed[i] = true
                backtracking(tempWeight, num + 1)
                isUsed[i] = false
            }
        }
    }

    backtracking(500, 0)
    bw.write(count.toString())
    bw.flush()
    bw.close()
}