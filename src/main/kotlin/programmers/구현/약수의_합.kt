package programmers.구현

class 약수의_합 {
    fun solution(n: Int): Int {
        var sum = 0

        for (i in 1..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                sum += i
                if (i != n / i) {
                    sum += n / i
                }
            }
        }
        return sum
    }
}