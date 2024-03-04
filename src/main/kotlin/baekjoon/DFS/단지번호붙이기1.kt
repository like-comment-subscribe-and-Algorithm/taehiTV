package baekjoon.DFS

// boj 2667

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val dx = intArrayOf(-1, 0, 0, 1)
    val dy = intArrayOf(0, -1, 1, 0)

    val n = br.readLine().toInt()
    val board = Array(n) { IntArray(n) }
    for (i in 0 until n) {
        val input = br.readLine()
        for (j in 0 until n) {
            board[i][j] = input[j] - '0'
        }
    }
    var count = 0
    var houseCount = mutableListOf<Int>()

    fun dfs(startX: Int, startY: Int) {
        repeat(4) {
            val nx = startX + dx[it]
            val ny = startY + dy[it]

            if (nx in 0 until n && ny in 0 until n) {
                if (board[nx][ny] == 1) {
                    board[nx][ny] = 0
                    count++
                    dfs(nx, ny)
                }
            }
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (board[i][j] == 1) {
                count = 1
                board[i][j] = 0
                dfs(i, j)
                houseCount.add(count)
            }
        }
    }

    bw.write(houseCount.size.toString())
    bw.newLine()
    houseCount.sort()
    for (i in 0 until houseCount.size) bw.write("${houseCount[i]}\n")
    bw.flush()
    bw.close()

}