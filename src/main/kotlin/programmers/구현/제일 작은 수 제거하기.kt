package programmers.구현

class `제일 작은 수 제거하기` {
    fun solution(arr: IntArray): IntArray {
        if (arr.size == 1) return intArrayOf(-1)
        var min = Int.MAX_VALUE
        val list = mutableListOf<Int>()

        for (i in arr) {
            if (i < min) min = i
        }

        for (i in arr) {
            if (i != min) list.add(i)
        }

        return list.toIntArray()

    }
}