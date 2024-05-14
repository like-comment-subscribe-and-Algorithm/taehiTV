package programmers.구현

class Solution2 {
    // mutableMapOf과 mutableSetOf 사용하기
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer = IntArray(id_list.size)
        val reportSet = report.toSet()
        val reports = reportSet.toList()
        val reporters = Array(id_list.size) { mutableListOf("") }
        val bannedCount = IntArray(id_list.size)

        for (i in 0 until reports.size) {
            val (reporter, banned) = reports[i].split(" ")
            val reporterIndex = id_list.indexOf(reporter)
            val bannedIndex = id_list.indexOf(banned)
            bannedCount[bannedIndex] += 1
            reporters[reporterIndex].add(banned)
        }

        for (i in 0 until id_list.size) {
            if (bannedCount[i] >= k) {
                for (j in 0 until id_list.size) {
                    if (reporters[j].contains(id_list[i])) {
                        answer[j] += 1
                    }
                }
            }
        }

        return answer
    }
}