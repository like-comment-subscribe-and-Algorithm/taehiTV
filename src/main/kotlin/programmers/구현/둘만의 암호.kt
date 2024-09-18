package programmers.구현

class `둘만의 암호` {

    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        val alphabet = ('a'..'z').joinToString("")
        val list = mutableListOf<Char>()
        var temp = 'a'
        var count = 0

        for (i in 0 until s.length) {
            temp = s[i]
            count = 0

            while (count < index) {
                val newIndex = temp - 'a' + 1
                temp = if (newIndex > 25) alphabet[newIndex - 26] else alphabet[newIndex]

                if (skip.contains(temp.toString())) continue
                else count++
            }
            list.add(temp)
        }

        return list.joinToString("")
    }
}