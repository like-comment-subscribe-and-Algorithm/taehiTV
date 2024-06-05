package programmers.구현

import java.util.*

class 명예의_전당1 {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer = IntArray(score.size)
        val hof = PriorityQueue<Int>()

        for (i in score.indices) {
            if (i < k) {
                hof.offer(score[i])
                answer[i] = hof.peek()
            } else {
                if (hof.peek() < score[i]) {
                    hof.offer(score[i])
                    hof.poll()
                }

                answer[i] = hof.peek()
            }
        }


        return answer
    }
}