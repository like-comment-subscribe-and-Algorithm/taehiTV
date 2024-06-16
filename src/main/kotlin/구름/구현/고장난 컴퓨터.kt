package 구름.구현

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, c) = br.readLine().split(" ").map { it.toInt() }
    var leftWordCount = 0
    val word = mutableListOf<Int>()
    val time = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    word.add(time[0])

    for (i in 1 until n) {
        if (time[i-1] + c < time[i]) word.clear()
        word.add(time[i])
    }

    bw.write(word.size.toString())
    bw.flush()
    bw.close()

}