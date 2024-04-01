package baekjoon.그리디

// boj 1105

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (l, r) = br.readLine().split(" ")
    val lLength = l.length
    val rLength = r.length
    var result = 0

    if (lLength != rLength) {
        bw.write("0")
        bw.flush()
        bw.close()
        return
    }

    for (i in 0 until lLength) {
        if (l[i] - '0' != r[i] - '0') {
            break
        } else if (l[i] - '0' == 8 && r[i] - '0' == 8) {
            result++
        }
    }

    bw.write(result.toString())
    bw.flush()
    bw.close()

}