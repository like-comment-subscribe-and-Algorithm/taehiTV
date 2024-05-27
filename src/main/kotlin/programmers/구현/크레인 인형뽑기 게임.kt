package programmers.구현

class Solution7 {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val basket = mutableListOf<Int>(0)
        val newBoard : Array<IntArray> = board

        for (i in moves.indices) {
            for (j in newBoard.indices) {
                val doll = newBoard[j][moves[i]-1]
                if (doll != 0) {
                    if (basket.last() == doll) {
                        answer += 2
                        basket.removeLast()
                    } else {
                        basket.add(doll)
                    }
                    newBoard[j][moves[i]-1] = 0
                    break
                }
            }
        }

        return answer
    }
}