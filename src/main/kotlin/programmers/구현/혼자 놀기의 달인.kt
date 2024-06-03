package programmers.구현

class 혼자_놀기의_달인 {
    fun solution(cards: IntArray): Int {
        var answer: Int = 1
        val boxList = mutableListOf<Int>()

        for (i in cards.indices) {
            var card = cards[i]
            if (card == 0) continue
            cards[i] = 0
            var count = 1
            var flag = true

            while(flag) {
                if (cards[card-1] != 0) {
                    val newIndex = cards[card-1]
                    cards[card-1] = 0
                    card = newIndex
                    count += 1
                } else {
                    boxList.add(count)
                    flag = false
                }
            }
        }

        if (boxList.size < 2) return 0
        boxList.sortDescending()

        return boxList[0] * boxList[1]
    }
}