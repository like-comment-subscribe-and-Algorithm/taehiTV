package programmers.구현

class `행렬의 덧셈` {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val rowSize = arr1.size
        val columnSize = arr1[0].size
        var answer = Array(rowSize) { IntArray(columnSize) }

        for (i in 0 until rowSize) {
            for (j in 0 until columnSize) {
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }

        return answer
    }
}