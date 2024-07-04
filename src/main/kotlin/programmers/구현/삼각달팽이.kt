package programmers.구현

class 삼각_달팽이 {
    fun solution(n: Int): IntArray {
        val list = mutableListOf<Int>()

        val arr = Array(n) { IntArray(n) }
        val dx = intArrayOf(1, 0, -1)
        val dy = intArrayOf(0, 1, -1)
        var d = 0
        var (x, y) = intArrayOf(0, 0)

        for (i in 1 .. n * (n+1) / 2) {
            arr[x][y] = i

            val newX = x + dx[d]
            val newY = y + dy[d]

            if (newX !in 0 until n || newY !in 0 until n || arr[newX][newY] != 0 || newX < newY) {
                d = (d + 1) % 3
            }

            x += dx[d]
            y += dy[d]
        }

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (arr[i][j] != 0) list.add(arr[i][j])
            }
        }

        val answer = list.toIntArray()
        return answer
    }
}