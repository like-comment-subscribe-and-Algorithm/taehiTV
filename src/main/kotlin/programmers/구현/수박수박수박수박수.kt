package programmers.구현

class 수박수박수박수박수 {
    fun solution(n: Int): String {
        val sb = StringBuilder()
        if (n % 2 == 0) {
            repeat(n / 2) {
                sb.append("수")
                sb.append("박")
            }
            return sb.toString()
        } else {
            repeat(n / 2) {
                sb.append("수")
                sb.append("박")
            }
            sb.append("수")
            return sb.toString()
        }
    }
}