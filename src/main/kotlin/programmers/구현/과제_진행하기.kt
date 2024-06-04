package programmers.구현

import java.util.*

class 과제_진행하기 {
    data class Plan(
        val name: String,
        val startTime: Int,
        val duration: Int
    )

    fun solution(plans: Array<Array<String>>): Array<String> {
        val planList = mutableListOf<Plan>()
        var currentTime = 0
        val stack = Stack<Plan>()
        val done = mutableListOf<String>()

        // 시간을 분으로 계산
        for (plan in plans) {
            val (hour, minute) = plan[1].split(":").map { it.toInt() }
            val startTime = hour * 60 + minute
            planList.add(Plan(plan[0], startTime, plan[2].toInt()))
        }

        // 시작 시간 순으로 정렬
        planList.sortBy { it.startTime }

        for (plan in planList) {

            // 현재 시간 이전에 끝날 과제를 완료한다.
            while (stack.isNotEmpty() && currentTime + stack.peek().duration <= plan.startTime) {
                val current = stack.pop()
                currentTime += current.duration
                done.add(current.name)
            }

            // 과제를 진행하고 멈춤
            if (stack.isNotEmpty()) {
                val pausedTask = stack.pop()
                val remainingDuration = pausedTask.duration - (plan.startTime - currentTime)
                stack.push(pausedTask.copy(duration = remainingDuration))
            }

            stack.push(plan)
            currentTime = plan.startTime
        }

        while (stack.isNotEmpty()) {
            done.add(stack.pop().name)
        }


        return done.toTypedArray()
    }
}