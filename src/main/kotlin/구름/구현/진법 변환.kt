package 구름.구현

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, t) = br.readLine().split(" ")
    val target = t.toLowerCase()

    for (i in 2..16) {

        // 소문자로 변환 후 비교
        if (n.toInt().toString(i).toLowerCase() == target) {
            bw.write(i.toString())
            break
        }
    }

    bw.flush()
    bw.close()
}