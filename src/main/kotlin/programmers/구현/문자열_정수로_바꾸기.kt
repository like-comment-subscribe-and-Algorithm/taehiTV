package programmers.구현

class 문자열_정수로_바꾸기 {
    fun solution(s: String): Int {
        var answer = 0

        if (s[0] == '-') {
            val sub = s.substring(1, s.length)
            answer = sub.toInt() * -1
        } else {
            answer = s.toInt()
        }

        return answer
    }
}