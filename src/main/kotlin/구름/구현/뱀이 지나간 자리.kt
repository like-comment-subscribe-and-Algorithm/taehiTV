package 구름.구현

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    fun rowMove() {
        val sb = StringBuilder()
        repeat(m) {
            sb.append("#")
        }
        bw.write(sb.toString())
    }

    fun downRight() {
        val sb = StringBuilder()
        repeat(m-1) {
            sb.append(".")
        }
        sb.append("#")
        bw.write(sb.toString())
    }

    fun downLeft() {
        val sb = StringBuilder()
        sb.append("#")
        repeat(m-1) {
            sb.append(".")
        }
        bw.write(sb.toString())
    }

    for (i in 0 until n) {
        if (i % 2 == 0) {
            rowMove()
        } else if (i % 4 == 1) {
            downRight()
        } else if (i % 4 == 3) {
            downLeft()
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()

}