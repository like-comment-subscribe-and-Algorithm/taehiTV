package programmers.구현

class 귤_고르기 {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var remainT = k
        var tangIndex = 0

        val arr = IntArray(10000001) { 0 }

        for (i in tangerine) {
            arr[i] += 1
        }

        arr.sortDescending()

        while (remainT > 0) {

            val tang = arr[tangIndex]

            if (tang > remainT) {
                remainT = 0
            } else {
                remainT -= tang
            }

            answer += 1
            tangIndex += 1
        }

        return answer
    }
}