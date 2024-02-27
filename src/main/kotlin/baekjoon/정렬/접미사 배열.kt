package baekjoon.정렬

// boj 11656

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val word = br.readLine()
    val wordLength = word.length
    val arr = Array<String>(wordLength) { "" }

    for (i in 0 until wordLength) {
        arr[i] = word.substring(i, wordLength)
    }

    arr.sort()

    for (i in 0 until wordLength) bw.write("${arr[i]}\n")

    bw.flush()
    bw.close()

}