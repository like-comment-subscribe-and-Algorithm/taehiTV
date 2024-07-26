package programmers.구현

class `가운데 글자 가져오기` {
    fun solution(s: String): String {
        if (s.length % 2 == 0) {
            val middle = s.length / 2 - 1
            return s.substring(middle, middle + 2)
        } else {
            val middle = s.length / 2
            return s[middle].toString()
        }
    }
}