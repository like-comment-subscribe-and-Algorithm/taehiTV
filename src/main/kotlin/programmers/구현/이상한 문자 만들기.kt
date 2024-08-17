package programmers.구현

class `이상한 문자 만들기` {
    fun solution(s: String): String {
        val words = s.split(" ")
        val answer = mutableListOf<String>()

        for (word in words) {
            val temp = mutableListOf<String>()
            for (i in 0 until word.length) {
                if (i % 2 != 0) temp.add(word[i].toString().lowercase())
                else temp.add(word[i].toString().uppercase())
            }
            answer.add(temp.joinToString(""))
        }

        return answer.joinToString(" ")
    }
}