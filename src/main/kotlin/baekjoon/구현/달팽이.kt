package baekjoon.구현

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    // 0: 아래, 1: 오른쪽, 2: 위, 3: 왼쪽
    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, 1, 0, -1)
    var d = 0

    val n = br.readLine().toInt()
    val target = br.readLine().toInt()
    var (targetX, targetY) = arrayOf(0, 0)
    val arr = Array(n) { IntArray(n) }
    var (x, y) = arrayOf(0, 0)

    for (i in n * n downTo 1) {
        if (i == target) {
            targetX = x + 1
            targetY = y + 1
        }

        arr[x][y] = i

        val newX = x + dx[d]
        val newY = y + dy[d]

        if (newX !in 0 until n || newY !in 0 until n || arr[newX][newY] != 0) {
            d = (d + 1) % 4
        }

        x += dx[d]
        y += dy[d]
    }

    for (nums in arr) {
        bw.write(nums.joinToString(" "))
        bw.newLine()
    }
    bw.write("$targetX $targetY")
    bw.flush()
    bw.close()
}