package programmers.구현

class `문자열 다루기 기본` {
    fun solution(s: String): Boolean {
        return s.all { it.isDigit() } && (s.length == 4 || s.length == 6)
    }
}