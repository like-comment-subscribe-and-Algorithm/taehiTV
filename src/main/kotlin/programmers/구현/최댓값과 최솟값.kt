package programmers.구현

class `최댓값과 최솟값` {
    fun solution(s: String): String {
        val numbers = s.split(" ").map { it.toInt() }
        val max = numbers.maxOrNull() ?: 0
        val min = numbers.minOrNull() ?: 0

        return "$min $max"
    }
}