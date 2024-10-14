package programmers.구현

class 모의고사 {
    fun solution(answers: IntArray): IntArray {
        val pattern1 = intArrayOf(1, 2, 3, 4, 5)
        val pattern2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val pattern3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        val scores = intArrayOf(0, 0, 0)
        for (i in answers.indices) {
            if (answers[i] == pattern1[i % pattern1.size]) scores[0]++
            if (answers[i] == pattern2[i % pattern2.size]) scores[1]++
            if (answers[i] == pattern3[i % pattern3.size]) scores[2]++
        }

        val maxScore = scores.maxOrNull() ?: 0

        return scores.mapIndexed { index, score -> if (score == maxScore) index + 1 else null }
            .filterNotNull().toIntArray()

    }
}