package programmers.구현

import kotlin.math.sqrt

class `기사 단원의 무기` {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer = 0

        for (i in 1 .. number) {
            val result = calculate(i)
            if (result <= limit) answer += result
            else answer += power
        }

        return answer
    }

    fun calculate(num : Int): Int {
        var count = 0
        val sqrtN = sqrt(num.toDouble()).toInt()

        for (i in 1..sqrtN) {
            if (num % i == 0) {
                count ++
                if (i != num / i) count ++
            }
        }

        return count
    }
}