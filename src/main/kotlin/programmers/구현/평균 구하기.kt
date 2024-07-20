package programmers.구현

class `평균 구하기` {
    fun solution(arr: IntArray): Double {
        val n = arr.size
        var sum = 0.0
        arr.forEach { sum += it }
        return sum / n.toDouble()
    }
}