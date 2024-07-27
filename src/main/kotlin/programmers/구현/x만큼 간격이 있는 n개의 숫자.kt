package programmers.구현

class `x만큼 간격이 있는 n개의 숫자` {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n)

        for (i in 1 .. n) {
            answer[i-1] = x.toLong() * i
        }

        return answer
    }
}