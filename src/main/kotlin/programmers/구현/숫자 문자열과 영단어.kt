package programmers.구현

class Solution {
    fun solution(s: String): Int {
        val list = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var flag = true
        var str = s

        while (flag) {
            for (i in 0 until list.size) {
                if (str.contains(list[i])) {
                    str = str.replace(list[i], i.toString())
                    continue
                } else {
                    flag = false
                }
            }
        }


        return str.toInt()
    }

    // 더 좋은 풀이
    /*
    array로 생성하는 것이 좋음
    replace를 하면 있는 애들이 다 바뀜
     */
    fun bestSolution (s: String) : Int {
        val array = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var str = s

        for (i in 0..9) str = str.replace(array[i], "$i")

        return str.toInt()
    }

}

fun main(){
    val br = System.`in`.bufferedReader()
    val answer = Solution().bestSolution(br.readLine())
    println(answer.toString())
}