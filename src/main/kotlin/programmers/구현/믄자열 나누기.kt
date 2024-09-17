package programmers.구현

class `믄자열 나누기` {
    fun solution(s: String): Int {
        var answer: Int = 0
        var index = 0
        var x = ""
        var xCount = 1
        var yCount = 0

        while (index < s.length) {
            x = s[index].toString()

            while (xCount != yCount) {
                index += 1

                if (index >= s.length) {
                    return ++answer
                }

                if (s[index].toString() != x) yCount++
                else xCount++
            }
            xCount = 1
            yCount = 0
            index++
            answer++
        }

        return answer
    }
}