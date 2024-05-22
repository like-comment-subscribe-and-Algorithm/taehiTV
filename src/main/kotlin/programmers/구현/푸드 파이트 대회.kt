package programmers.구현

// 나머지를 굳이 구할 필요가 없음
class Solution3 {
    fun solution(food: IntArray): String {
        var answer: String = ""

        for (i in 1 until food.size) {
            val foodCount = food[i]
            val foodRemain = food[i] % 2
            val foodValue = food[i] / 2

            if (foodCount > 1) {
                if (foodRemain == 0) {
                    for (j in 0 until foodValue) {
                        answer += i.toString()
                    }
                } else {
                    for (j in 0 until foodValue) {
                        answer += i.toString()
                    }
                }
            }
        }

        val counterFoods = answer.reversed()
        answer += "0"
        answer += counterFoods

        return answer
    }
}