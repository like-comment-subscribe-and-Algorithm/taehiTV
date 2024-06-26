package 구름.구현

import kotlin.math.abs

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var d = 0
    var p = 0
    val table: Array<String> = Array<String>(n) { readLine()!! }

    for (winner in table) {
        if (winner == "D") d += 1
        else p += 1

        if (abs(d - p) == 2) {
            print("${d}:${p}")
            return
        }
    }

    print("${d}:${p}")
}