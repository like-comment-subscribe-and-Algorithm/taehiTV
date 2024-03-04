package baekjoon.백트래킹

// boj 15664

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = IntArray(m)
    val board = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val isUsed = BooleanArray(n)
    board.sort()

    val answerSet = LinkedHashSet<String>()

    fun dfs(start: Int) {
        if (start == m) {
            var answer = ""
            for (i in 0 until m) answer = answer.plus("${arr[i]} ")
            answerSet.add(answer)
            return
        }

        for (i in 0 until board.size) {
            if (start ==0 || (!isUsed[i] && arr[start - 1] <= board[i])) {
                arr[start] = board[i]
                isUsed[i] = true
                dfs(start + 1)
                isUsed[i] = false
            }
        }
    }

    dfs(0)

    for (answer in answerSet) {
        bw.write(answer)
        bw.newLine()
    }

    bw.flush()
    bw.close()

}