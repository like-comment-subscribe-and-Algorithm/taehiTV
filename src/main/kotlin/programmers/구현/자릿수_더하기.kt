package programmers.구현

class 자릿수_더하기 {
    fun solution(n: Int): Int {
        var N = n
        var answer = 0

        while (N > 0) {
            answer += N % 10
            N /= 10
        }

        return answer
    }
}