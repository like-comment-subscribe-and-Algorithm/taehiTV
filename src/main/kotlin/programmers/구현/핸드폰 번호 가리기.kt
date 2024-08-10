package programmers.구현

class `핸드폰 번호 가리기` {
    fun solution(phone_number: String): String {
        val size = phone_number.length
        var answer = Array<String>(size) { "" }

        for (i in 0 until size) {
            if (i < size - 4) answer[i] = "*"
            else answer[i] = phone_number[i].toString()
        }

        return answer.joinToString("")
    }
}