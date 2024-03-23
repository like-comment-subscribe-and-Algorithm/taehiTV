package programmers.구현

class 할인행사 {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        val items = mutableMapOf<String, Int>()

        for (i in discount.indices) {
            if (i < 10) {
                items[discount[i]] = items.getOrDefault(discount[i], 0) + 1
            } else {
                items[discount[i-10]] = items.getOrDefault(discount[i-10], 0) - 1
                items[discount[i]] = items.getOrDefault(discount[i], 0) + 1
            }

            var isAuth = true

            for (j in want.indices) {
                if (items.getOrDefault(want[j], 0) < number[j]) isAuth = false
            }

            if (isAuth) answer += 1
        }

        return answer
    }
}