package baekjoon.구현

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    var totalCredit = 0.0
    var totalGrade = 0.0


    for (i in 0 until 20) {
        val (subject, credit, grade) = br.readLine().split(" ")
        val score = when (grade) {
            "A+" -> 4.5
            "A0" -> 4.0
            "B+" -> 3.5
            "B0" -> 3.0
            "C+" -> 2.5
            "C0" -> 2.0
            "D+" -> 1.5
            "D0" -> 1.0
            "F" -> 0.0
            else -> continue
        }

        totalCredit += credit.toDouble()
        totalGrade += credit.toDouble() * score
    }

    bw.write((totalGrade / totalCredit).toString())
    bw.flush()
    bw.close()
}