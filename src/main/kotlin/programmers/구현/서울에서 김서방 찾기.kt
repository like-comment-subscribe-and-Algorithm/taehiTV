package programmers.구현

class `서울에서 김서방 찾기` {
    fun solution(seoul: Array<String>): String {
        for ((index, name) in seoul.withIndex()) {
            if (name == "Kim") {
                return "김서방은 ${index}에 있다"
            }
        }
        throw IllegalArgumentException("Kim이 배열에 없습니다.")

    }
}