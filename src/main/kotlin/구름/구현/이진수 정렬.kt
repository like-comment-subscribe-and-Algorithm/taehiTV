package 구름.구현

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toInt() }
    val sortedNumbers = arr.map { it to countOne(it) }
        .sortedWith(compareByDescending<Pair<Int, Int>> { it.second }
            .thenByDescending { it.first })
        .map { it.first }

    bw.write(sortedNumbers[k-1].toString())
    bw.flush()
    bw.close()
}

fun countOne(number : Int) = Integer.toBinaryString(number).count { it == '1' }