package programmers.구현

class `피보나치 수` {
    fun solution(n: Int): Int {
        val arr = IntArray(n + 1)

        arr[0] = 0
        arr[1] = 1

        for (i in 0 until n - 1) {
            arr[i + 2] = (arr[i + 1] + arr[i]) % 1234567
         }


        return arr[n]
    }
}