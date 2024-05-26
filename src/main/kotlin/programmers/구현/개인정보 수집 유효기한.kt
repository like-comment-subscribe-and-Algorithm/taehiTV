package programmers.구현

class Solution4 {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer = mutableListOf<Int>()

        val (todayY, todayM, todayD) = today.split(".").map{ it.toInt() }
        val todayDates = calculateDates(todayY, todayM, todayD)
        val termsMap = mutableMapOf<String, Int>()
        for (i in terms.indices) {
            val (term, length) = terms[i].split(" ")
            termsMap[term] = length.toInt()
        }

        for (i in privacies.indices) {
            val (info, term) = privacies[i].split(" ")
            val (infoY, infoM, infoD) = info.split(".").map { it.toInt() }

            val diff = todayDates - calculateDates(infoY, infoM, infoD)
            if (diff >= termsMap[term]!! * 28) answer.add(i+1)

        }

        return answer.toIntArray()
    }

    fun calculateDates(yy: Int, mm: Int, dd: Int) = yy * 28 * 12 + mm * 28 + dd
}