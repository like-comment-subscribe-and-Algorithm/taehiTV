package programmers.구현

class `콜라츠 추측` {
    fun solution(num: Int): Int {
        var n = 0
        var number = num.toLong()

        while (n < 500) {
            if (number == 1L) return n
            if (number % 2 == 0L) {
                number /= 2
            } else {
                number = number * 3 + 1
            }

            n++
        }

        return -1
    }
}