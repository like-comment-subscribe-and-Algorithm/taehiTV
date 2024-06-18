package 구름.구현

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    var (j, s) = br.readLine().split(" ").map { it.toInt() }
    val dDay = br.readLine().toInt()

    repeat(dDay) { index ->
        var amount = 0

        if (index % 2 == 0) {
            amount = if (j % 2 == 0) j / 2 else (j + 1) / 2
            j -= amount
            s += amount
        } else {
            amount = if (s % 2 == 0) s / 2 else (s + 1) / 2
            s -= amount
            j += amount
        }

    }

    bw.write("$j $s")
    bw.flush()
    bw.close()
}