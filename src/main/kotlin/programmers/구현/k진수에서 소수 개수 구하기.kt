package programmers.구현

import java.math.BigInteger

class k진수에서_소수_개수_구하기 {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0

        val kNum = n.toString(k)
        val arr = kNum.split("0")

        for (i in arr.indices) {
            if (arr[i] != "" && arr[i] != "1") {
                if (BigInteger(arr[i]).isProbablePrime(1)) answer += 1
            }
        }

        return answer
    }
}