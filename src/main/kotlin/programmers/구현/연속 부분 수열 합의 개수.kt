package programmers.구현

class 연속_부분_수열_합의_개수 {
    fun solution(elements: IntArray): Int {
        val sumSet = HashSet<Int>()

        for (i in elements.indices) {
            for (j in 1..elements.size) {
                var sum = 0
                for (k in 1..j) {
                    var index = i + k - 1
                    if (index >= elements.size) {
                        index -= elements.size
                    }
                    sum += elements[index]
                }
                sumSet.add(sum)
            }
        }

        return sumSet.size
    }
}