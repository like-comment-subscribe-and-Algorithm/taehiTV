package programmers.구현

class Solution5 {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0

        score.sort()
        val reversedScore = score.reversed().toIntArray()
        val boxCount = score.size / m

        for (i in 0 until boxCount) {
            answer += reversedScore[m * (i + 1) - 1] * m
        }

        return answer

    }
}