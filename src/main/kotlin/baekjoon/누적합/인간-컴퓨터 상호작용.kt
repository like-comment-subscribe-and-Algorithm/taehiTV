package baekjoon.누적합

// boj 16139

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val str = br.readLine()
    val q = br.readLine().toInt()
    val alphabetCountArr = Array(26) { IntArray(str.length + 1) }

    for (i in str.indices) {
        val charIndex = str[i] - 'a'
        for (j in 0 until 26) {
            alphabetCountArr[j][i + 1] = alphabetCountArr[j][i]
        }
        alphabetCountArr[charIndex][i + 1]++
    }

    repeat(q) {
        val (alpha, l, r) = br.readLine().split(" ")
        val alphaIndex = alpha[0] - 'a'

        val result = alphabetCountArr[alphaIndex][r.toInt() + 1] - alphabetCountArr[alphaIndex][l.toInt()]
        bw.write("$result\n")
    }
    bw.flush()
    bw.close()
}