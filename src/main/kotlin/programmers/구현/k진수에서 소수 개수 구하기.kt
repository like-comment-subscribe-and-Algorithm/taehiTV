package programmers.구현

class k진수에서_소수_개수_구하기 {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0

        val kNum = n.toString(k)
        val arr = kNum.split("0")

        for (i in arr.indices) {
            if (arr[i] != "") {
                if (isPrime(arr[i].toLong())) answer += 1
            }
        }

        return answer
    }

    fun isPrime(num : Long) : Boolean {
        if (num < 2) return false

        for (i in 2..Math.sqrt(num.toDouble()).toLong()) {
            if (num % i == 0L) return false
        }

        return true
    }
}