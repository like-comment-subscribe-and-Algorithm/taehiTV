package 구름.구현

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    (1..br.readLine().toInt())
        .mapIndexed { index, _ ->
            val (v, w) = br.readLine().split(" ").map { it.toDouble() }
            val price = (v * w * 10).toInt()
            Pair(index + 1, price)
        }
        .sortedBy{ -it.second }
        .forEach { bw.write("${it.first} ") }

    bw.flush()
    bw.close()
}