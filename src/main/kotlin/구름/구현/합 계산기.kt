package 구름.구현

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val t = br.readLine().toInt()
    var sum = 0

    repeat (t) {
        val (a, o, b) = br.readLine().split(" ")
        sum += when (o) {
            "+" -> a.toInt() + b.toInt()
            "-" -> a.toInt() - b.toInt()
            "*" -> a.toInt() * b.toInt()
            "/" -> a.toInt() / b.toInt()
            else -> 0
        }
    }

    bw.write(sum.toString())
    bw.flush()
    bw.close()
}