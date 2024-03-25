package baekjoon.그리디

// boj 28234

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val velo = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    var sum = 1L
    val courseCount = velo.size

    velo[courseCount - 1] = 1

    for (i in courseCount - 1 downTo 1) {
        if (velo[i] >= velo[i - 1]) {
            sum += velo[i - 1]
        } else {
            sum += (velo[i] + 1)
            velo[i - 1] = velo[i] + 1
        }
    }

    bw.write(sum.toString())
    bw.flush()
    bw.close()

}