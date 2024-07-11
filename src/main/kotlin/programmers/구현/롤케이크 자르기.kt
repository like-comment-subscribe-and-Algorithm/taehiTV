package programmers.구현

class `롤케이크 자르기` {
    fun solution(topping: IntArray): Int {
        var answer = 0
        val aMap = mutableMapOf<Int, Int>()
        val bMap = mutableMapOf<Int, Int>()

        for (slice in topping) {
            bMap[slice] = bMap.getOrDefault(slice, 0) + 1
        }

        for (i in 0 until topping.size - 1) {
            val slice = topping[i]
            aMap[slice] = aMap.getOrDefault(slice, 0) + 1

            val b = bMap.getOrDefault(slice, -1)

            if (b > 1) {
                bMap[slice] = bMap.getOrDefault(slice, 0) - 1
            } else if (b == 1) {
                bMap.remove(slice)
            }

            if (aMap.size == bMap.size) answer += 1
        }

        return answer
    }
}