package programmers.구현

class 오픈채팅방 {
    fun solution(record: Array<String>): Array<String> {
        val userMap = mutableMapOf<String, String>()
        val actions = mutableListOf<Pair<String, String>>()

        for (entry in record) {
            val parts = entry.split(" ")
            val action = parts[0]
            val userId = parts[1]

            if (action != "Leave") {
                val nickname = parts[2]
                userMap[userId] = nickname
            }

            if (action != "Change") {
                actions.add(action to userId)
            }
        }

        val result = actions.map { (action, userId) ->
            when (action) {
                "Enter" -> "${userMap[userId]}님이 들어왔습니다."
                "Leave" -> "${userMap[userId]}님이 나갔습니다."
                else -> ""
            }
        }

        return result.toTypedArray()
    }
}