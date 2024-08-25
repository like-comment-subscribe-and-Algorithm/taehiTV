package programmers.구현

class `시저 암호` {
    fun solution(s: String, n: Int): String {
        return s.map { c ->
            when (c) {
                in 'A'..'Z' -> ((c - 'A' + n) % 26 + 'A'.toInt()).toChar()
                in 'a'..'z' -> ((c - 'a' + n) % 26 + 'a'.toInt()).toChar()
                else -> c
            }
        }.joinToString("")
    }
}