package baekjoon.백트래킹

// boj 1759

var password = ArrayList<String>()
val aeiou = arrayOf("a", "e", "i", "o", "u")

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (l, c) = br.readLine().split(" ").map { it.toInt() }
    val alphabets = br.readLine().split(" ").toTypedArray().sortedArray()

    dfs(0, 0, l, alphabets)
}

fun dfs(depth: Int, start: Int, end: Int, alphabet: Array<String>) {
    if (depth == end) {
        var result = ""
        var vowelCount = 0

        password.forEach {
            if (it in aeiou) vowelCount++
            result += it
        }

        if (vowelCount == 0 || end - vowelCount <= 1) return

        println(result)

    }

    for (i in start until alphabet.size) {
        password.add(alphabet[i])
        dfs(depth + 1, i + 1, end, alphabet)
        password.removeAt(password.lastIndex)
    }
}