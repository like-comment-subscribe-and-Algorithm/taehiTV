package 구름.구현

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val dx = intArrayOf(-1, 0, 0, 1)
    val dy = intArrayOf(0, -1, 1, 0)

    var max = 0
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val board = Array(n) { br.readLine().split(" ").toTypedArray() }
    val numberBoard = Array(n) { IntArray(n) }

    repeat(k) {
        val (y, x) = br.readLine().split(" ").map { it.toInt() - 1 }
        numberBoard[y][x] += updateNumber(board[y][x])
        if (numberBoard[y][x] > max) max = numberBoard[y][x]

        repeat(4) {
            val nx = x + dx[it]
            val ny = y + dy[it]

            if (nx in 0 until n && ny in 0 until n) {
                numberBoard[ny][nx] += updateNumber(board[ny][nx])
                if (numberBoard[ny][nx] > max) max = numberBoard[ny][nx]
            }

        }
    }

    bw.write(max.toString())
    bw.flush()
    bw.close()

}

fun updateNumber(boom: String) = when (boom) {
    "0" -> 1
    "#" -> 0
    "@" -> 2
    else -> 0
}