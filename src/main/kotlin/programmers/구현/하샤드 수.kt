package programmers.구현

class `하샤드 수` {
    fun solution(x: Int): Boolean {
        var sum = 0
        val str = x.toString()

        for (i in str) {
            sum += i - '0'
        }

        return if (x % sum == 0) true else false
    }
}