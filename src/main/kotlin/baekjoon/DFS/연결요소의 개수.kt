package baekjoon.DFS

// boj 11724

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    var count = 0
    val graph = Array(n + 1) { ArrayList<Int>() }
    val isVisited = BooleanArray(n + 1)

    repeat(m) {
        val (start, end) = br.readLine().split(" ").map { it.toInt() }
        graph[start].add(end)
        graph[end].add(start)
    }

    fun dfs(start: Int) {
        isVisited[start] = true
        for (i in graph[start]) {
            if (!isVisited[i]) dfs(i)
        }
    }

    for (i in 1..n) {
        if (!isVisited[i]) {
            dfs(i)
            count++
        }
    }

    bw.write(count.toString())
    bw.flush()
    bw.close()

}