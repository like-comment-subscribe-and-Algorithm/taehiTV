package programmers.구현

import java.util.*

class 뒤에_있는_큰_수_찾기 {
    fun solution(numbers: IntArray): IntArray {
        var answer = IntArray(numbers.size)
        val stack = Stack<Int>()

        for (i in numbers.size - 1 downTo 0) {
            var flag = true

            while (flag) {
                if (stack.isEmpty()) {
                    stack.push(numbers[i])
                    answer[i] = -1
                    flag = false
                } else if (stack.peek() > numbers[i]) {
                    answer[i] = stack.peek()
                    stack.push(numbers[i])
                    flag = false
                } else {
                    stack.pop()
                }
            }

        }
        return answer
    }
}