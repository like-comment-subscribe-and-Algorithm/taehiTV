package programmers.구현

class `나머지가 1이 되는 수 찾기` {
    fun solution(n: Int): Int {
        var answer: Int = 0

        for (i in 2 until n) {
            if (n % i == 1) {
                answer = i
                break
            }
        }

        return answer
    }
}