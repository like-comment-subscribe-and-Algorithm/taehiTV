package programmers.구현

class 자연수_뒤집어_배열로_만들기 {
    fun solution(n: Long): IntArray {
        var k = n.toString()
        var list = mutableListOf<Int>()

        for (i in (k.length - 1) downTo 0) {
            println(k[i])
            list.add(k[i] - '0')
        }

        val answer = list.toIntArray()

        return answer
    }
}