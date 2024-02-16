package baekjoon.이분탐색

// boj 1920

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val numbers = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val m = br.readLine().toInt()
    val targetNumbers = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    numbers.sort()

    for (i in 0 until m) {
        val targetNumber = targetNumbers[i]

        if (numbers.binarySearch(targetNumber) >= 0) bw.write("1 \n") else bw.write("0 \n")
    }

    br.close()
    bw.flush()
    bw.close()
}