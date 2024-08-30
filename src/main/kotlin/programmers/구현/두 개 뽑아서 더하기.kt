package programmers.구현

class `두 개 뽑아서 더하기`() {
    fun solution(numbers: IntArray): IntArray {
        val list = hashSetOf<Int>()

        for (i in 0 until numbers.size) {
            for (j in i + 1 until numbers.size) {
                list.add(numbers[i] + numbers[j])
            }
        }

        return list.sorted().toIntArray()
    }
}