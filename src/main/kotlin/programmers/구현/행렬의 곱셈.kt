package programmers.구현

class `행렬의 곱셈` {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val row = arr1.size
        val col = arr2[0].size

        val answer = Array(row) { IntArray(col) }

        for (i in arr1.indices) {
            for (j in 0 until col) {
                var sum = 0
                for (k in arr2.indices) {
                    sum += arr1[i][k] * arr2[k][j]
                }
                answer[i][j] = sum
            }
        }

        return answer
    }
}