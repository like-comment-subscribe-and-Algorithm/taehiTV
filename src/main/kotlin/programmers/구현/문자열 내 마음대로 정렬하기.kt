package programmers.구현

class `문자열 내 마음대로 정렬하기` {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        return strings.sortedWith(compareBy({ it[n] }, { it })).toTypedArray()
    }
}