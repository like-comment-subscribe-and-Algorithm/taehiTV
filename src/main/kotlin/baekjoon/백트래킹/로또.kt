package baekjoon.백트래킹

// BOJ 6603

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val tempArray = IntArray(12)

    fun backtracking(isUsed: BooleanArray, numbers: IntArray, start: Int, end: Int) {
        if (start == 6) {
            for (i in 0 until 6) {
                bw.write("${tempArray[i]} ")
            }
            bw.newLine()
            return
        }

        for (i in 0 until end) {
            if (!isUsed[i]) {
                if (start == 0 || tempArray[start - 1] < numbers[i]) {
                    isUsed[i] = true
                    tempArray[start] = numbers[i]
                    backtracking(isUsed, numbers, start + 1, end)
                    isUsed[i] = false
                }
            }
        }
    }

    while (true) {
        val input = br.readLine().split(" ").map { it.toInt() }
        val k = input[0]
        if (k == 0) break
        val sArr = IntArray(input.size - 1) { input[it + 1] }
        val isUsed = BooleanArray(sArr.size)

        backtracking(isUsed, sArr, 0, k)
        bw.newLine()

    }

    bw.flush()
    bw.close()

}