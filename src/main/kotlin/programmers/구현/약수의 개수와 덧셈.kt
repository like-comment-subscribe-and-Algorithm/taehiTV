package programmers.구현

class `약수의 개수와 덧셈` {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0

        for (num in left .. right) {
            val count = yaksu(num)

            if (count % 2 == 0) answer += num
            else answer -= num
        }

        return answer
    }

    fun yaksu(n: Int) : Int {
        var i = 1
        var count = 0
        while (i * i <= n) {
            if (n % i == 0) {
                if (i * i != n) count += 2
                else count += 1
            }
            i++
        }

        return count
    }
}