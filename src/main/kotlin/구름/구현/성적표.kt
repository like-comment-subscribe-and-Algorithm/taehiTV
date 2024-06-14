package 구름.구현

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array<Triple<Int, Int, Float>>(100001) { Triple(0, 0, 0f) }

    repeat(n) {
        val (c, s) = br.readLine().split(" ").map { it.toInt() }

        val info = arr[c]
        val num = info.second
        val mean = info.third

        val newNum = num + 1
        val newMean = (mean * num + s) / newNum

        arr[c] = Triple(c, newNum, newMean)
    }

    arr.sortByDescending { it.third }

    bw.write(arr[0].first.toString())
    bw.flush()
    bw.close()
}