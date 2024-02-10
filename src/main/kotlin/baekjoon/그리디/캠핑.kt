package baekjoon.그리디

import kotlin.math.min

// boj 4796

fun main() {
    var caseCount = 1

    while (true) {
        val input = readln().split(" ").map { it.toInt() }
        val usableDay = input[0]
        val continuousDay = input[1]
        val vacationDay = input[2]

        if (usableDay == 0 && continuousDay == 0 && vacationDay == 0) break

        val maxUsableDay = (vacationDay / continuousDay) * usableDay + min(vacationDay % continuousDay, usableDay)
        println("Case ${caseCount++}: $maxUsableDay")
    }
}