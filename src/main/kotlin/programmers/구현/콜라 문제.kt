package programmers.구현

class `콜라 문제` {
    fun solution(a: Int, b: Int, n: Int): Int {
        var bottles = n
        var totalCokes = 0

        while (bottles >= a) {
            val newCokes = bottles / a * b
            totalCokes += newCokes
            bottles = bottles % a + newCokes
        }

        return totalCokes
    }
}