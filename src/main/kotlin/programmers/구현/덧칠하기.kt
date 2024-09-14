package programmers.구현

class 덧칠하기 {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var lastPainted = 0

        for (i in section) {
            if (i > lastPainted) {
                answer += 1
                lastPainted = i + m - 1
            }
        }

        return answer
    }
}