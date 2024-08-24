package programmers.구현

class 삼총사 {
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        val size = number.size

        for (i in 0 until size) {
            for (j in i+1 until size) {
                for (k in j+1 until size) {
                    if (number[i] + number[j] + number[k] == 0) answer += 1
                }
            }
        }

        return answer
    }
}