package baekjoon.백트래킹

// boj 9663

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    var count = 0
    val isUsedColumn = BooleanArray(40)
    val isUsedCross1 = BooleanArray(40)
    val isUsedCross2 = BooleanArray(40)

    fun dfs(start: Int) {
        if (start == n) {
            count++
            return
        }

        for (i in 0 until n) {
            if (isUsedColumn[i] || isUsedCross1[i + start] || isUsedCross2[start - i + n - 1]) continue
            isUsedColumn[i] = true
            isUsedCross1[i + start] = true
            isUsedCross2[start - i + n - 1] = true
            dfs(start + 1)
            isUsedColumn[i] = false
            isUsedCross1[i + start] = false
            isUsedCross2[start - i + n - 1] = false
        }
    }

    dfs(0)
    bw.write(count.toString())
    bw.flush()
    bw.close()

}