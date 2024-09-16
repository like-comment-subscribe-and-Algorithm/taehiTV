package programmers.구현

class 옹알이2 {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val words = listOf("aya", "ye", "woo", "ma")

        for (word in babbling) {
            var tempWord = word
            var previous = ""

            var isValid = true

            while (tempWord.isNotEmpty() && isValid) {
                var found = false

                for (pWord in words) {
                    if (tempWord.startsWith(pWord) && pWord != previous) {
                        tempWord = tempWord.removePrefix(pWord)
                        previous = pWord
                        found = true
                        break
                    }
                }

                if (!found) isValid = false
            }

            if (isValid && tempWord.isEmpty()) answer++

        }

        return answer
    }
}