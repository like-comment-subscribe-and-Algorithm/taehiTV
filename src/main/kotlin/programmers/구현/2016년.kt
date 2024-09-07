package programmers.구현

class `2016년` {
    fun solution(a: Int, b: Int): String {
        val daysOfWeek = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
        val daysInMonth = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

        var totalDays = b - 1
        for (i in 0 until a - 1) {
            totalDays += daysInMonth[i]
        }

        return daysOfWeek[totalDays % 7]
    }
}