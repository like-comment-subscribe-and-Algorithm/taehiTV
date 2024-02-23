package baekjoon.그리디

// boj 6550

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    var input = ""

    while (true) {
        input = br.readLine() ?: break
        if (!input.contains(" ")) break
        val (s, t) = input.split(" ")

        var index = 0

        for (i in 0 until t.length) {
            if (s[index] == t[i]) index++
            if (index == s.length) break
        }

        if (index == s.length) bw.write("Yes\n")
        else bw.write("No\n")
    }

    bw.flush()
    bw.close()
}