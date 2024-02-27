package baekjoon.DFS

// boj 9466

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val testCaseCount = br.readLine().toInt()
    repeat(testCaseCount) {
        val studentCount = br.readLine().toInt()
        val input = br.readLine().split(" ").map { it.toInt() }
        val graph = IntArray(studentCount + 1)
        for (i in 1..studentCount) graph[i] = input[i - 1]

        val visited = BooleanArray(studentCount + 1)
        val finished = BooleanArray(studentCount + 1)
        var count = 0

        fun dfs(current: Int, count: Int): Int {
            visited[current] = true
            val next = graph[current]
            var currentCount = count
            if (visited[next]) {
                if (!finished[next]) {
                    var temp = next
                    while (temp != current) {
                        temp = graph[temp]
                        currentCount++
                    }
                    currentCount++
                }
            } else {
                currentCount = dfs(next, currentCount)
            }
            finished[current] = true
            return currentCount
        }

        for (i in 1..studentCount) {
            if (!visited[i]) count = dfs(i, count)
        }
        bw.write("${(studentCount - count)}\n")
    }
    bw.flush()
    bw.close()
}
