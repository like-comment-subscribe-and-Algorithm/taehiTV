package programmers.구현

class 음양_더하기 {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0

        for (i in absolutes.indices) {
            answer += if (signs[i]) absolutes[i] else absolutes[i] * -1
        }

        return answer
    }
}