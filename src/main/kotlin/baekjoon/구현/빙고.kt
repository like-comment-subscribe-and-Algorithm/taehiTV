package baekjoon.구현

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val board = Array(5) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }
    val checkBoard = Array(5) { BooleanArray(5) }
    var bingoCount = 0
    var count = 0

    fun checkRowBingo(numY: Int): Boolean {
        for (i in 0 until 5) {
            if (!checkBoard[numY][i]) return false
        }
        return true
    }

    fun checkColumnBingo(numX: Int): Boolean {
        for (i in 0 until 5) {
            if (!checkBoard[i][numX]) return false
        }
        return true
    }

    fun checkLeftDiagonalBingo(): Boolean {
        for (i in 0 until 5) {
            if (!checkBoard[i][i]) return false
        }
        return true
    }

    fun checkRightDiagonalBingo(): Boolean {
        for (i in 0 until 5) {
            if (!checkBoard[i][4 - i]) return false
        }
        return true
    }

    fun checkNumber(number: Int) {
        for (i in 0 until 5) {
            val boardIndex = board[i].indexOf(number)
            if (boardIndex != -1) {
                checkBoard[i][boardIndex] = true
                if (checkRowBingo(i)) bingoCount += 1
                if (checkColumnBingo(boardIndex)) bingoCount += 1
                if (i == boardIndex && checkLeftDiagonalBingo()) bingoCount += 1
                if (i + boardIndex == 4 && checkRightDiagonalBingo()) bingoCount += 1
            }
        }
    }

    repeat(5) {
        val input = br.readLine().split(" ").map { it.toInt() }
        repeat(5) { index ->
            count += 1
            checkNumber(input[index])

            if (bingoCount == 3) {
                bw.write(count.toString())
                bw.flush()
                bw.close()
                return
            }
        }
    }
}
