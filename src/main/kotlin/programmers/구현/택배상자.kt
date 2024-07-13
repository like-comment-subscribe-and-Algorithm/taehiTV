package programmers.구현

import java.util.*

class 택배상자 {
    fun solution(order: IntArray): Int {
        var answer = 0
        val stack = Stack<Int>()
        var currentBox = 1

        for (box in order) {
            // 현재 상자 번호와 맞지 않는 경우 스택에 추가
            while (currentBox <= box) {
                stack.push(currentBox)
                currentBox += 1
            }

            // 스택에서 상자를 꺼내 트럭에 싣기
            if (stack.isNotEmpty() && stack.peek() == box) {
                stack.pop()
                answer += 1
            } else {
                break
            }
        }

        return answer
    }
}