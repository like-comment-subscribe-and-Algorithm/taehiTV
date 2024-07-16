package programmers.구현

class `정수 내림차순으로 정렬` {
    fun solution(n: Long): Long {
        var str = n.toString()

        val answer = str.toCharArray().sortedArrayDescending().joinToString("").toLong()

        return answer
    }
}