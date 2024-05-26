package programmers.구현

class Solution6 {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer = IntArray(photo.size)
        val memoryMap = mutableMapOf<String, Int>()

        for (i in name.indices) {
            memoryMap[name[i]] = yearning[i]
        }

        for (i in photo.indices) {
            for (j in photo[i].indices) {
                answer[i] += memoryMap[photo[i][j]] ?: 0
            }
        }

        return answer
    }
}