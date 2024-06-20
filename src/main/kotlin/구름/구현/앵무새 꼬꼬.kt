package 구름.구현

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val moList = listOf("a", "e", "i", "o", "u")

    repeat(n) {
        val input = br.readLine()
        val sb = StringBuilder()

        for (i in 0 until input.length) {
            if (moList.contains(input[i].toLowerCase().toString())) {
                sb.append(input[i])
            }
        }

        if (sb.toString().length == 0) {
            bw.write("???")
        } else {
            bw.write(sb.toString())
        }

        bw.newLine()

    }

    bw.flush()
    bw.close()
}