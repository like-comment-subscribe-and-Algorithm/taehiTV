package baekjoon.자료구조

// boj 1764

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val set = LinkedHashSet<String>(n)
    val result = mutableListOf<String>()

    repeat(n) {
        set.add(br.readLine())
    }

    repeat(m) {
        val input = br.readLine()
        if (set.contains(input)) result.add(input)
    }

    bw.write(result.size.toString())
    bw.newLine()
    result.sort()

    for (i in result) {
        bw.write(i)
        bw.newLine()
    }

    bw.flush()
    bw.close()

}