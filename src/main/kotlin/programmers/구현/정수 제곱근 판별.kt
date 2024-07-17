package programmers.구현

import kotlin.math.sqrt

class `정수 제곱근 판별` {
    fun solution(n: Long): Long {
        val m = sqrt(n.toDouble()).toLong()

        return if (m * m == n) (m + 1) * (m + 1) else -1

    }
}