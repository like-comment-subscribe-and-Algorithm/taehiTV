package programmers.구현

class 크기가_작은_부분_문자열 {
//    fun solution(t: String, p: String): Int {
//        var answer: Int = 0
//
//        val pSize = p.length
//
//        for (i in 0..(t.length - pSize)) {
//            val subT = t.substring(i, i + pSize).toInt()
//
//            if (subT <= p.toInt()) answer += 1
//        }
//
//        return answer
//    }

    // Long으로 변환해야 함

    fun solution(t: String, p: String): Int {
        var answer: Int = 0

        val pSize = p.length

        for (i in 0..(t.length - pSize)) {
            val subT = t.substring(i, i + pSize).toLong()

            if (subT <= p.toLong()) answer += 1
        }

        return answer
    }
}