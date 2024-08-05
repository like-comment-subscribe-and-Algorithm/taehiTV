package programmers.구현

class `나누어 떨어지는 숫자 배열` {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = mutableListOf<Int>()

        for (i in arr) {
            if (i % divisor == 0) answer.add(i)
        }

        if (answer.size == 0) {
            return intArrayOf(-1)
        } else {
            answer.sort()
            return answer.toIntArray()
        }
    }
}