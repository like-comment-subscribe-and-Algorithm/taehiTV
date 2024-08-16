package programmers.구현

class `3진법 뒤집기` {
    fun solution(n: Int): Int {
        val n3 = n.toString(3)
        val nR = n3.reversed()
        return nR.toInt(3)
    }
}