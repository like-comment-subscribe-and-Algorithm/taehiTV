package 구름.구현

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    for (i in 1..n) {
        for (j in 1..n) {
            if (j != n) {
                bw.write("${n * (i-1) + j} ")
            } else {
                bw.write("${n * (i-1) + j}\n")
            }
        }
    }

    bw.flush()
    bw.close()
}