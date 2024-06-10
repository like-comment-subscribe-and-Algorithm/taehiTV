package 구름.구현

fun main(args: Array<String>) {
    val (houseCount, rainyDays) = readLine()!!.split(" ").map { it.toInt() }
    val house = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val waterHeight = IntArray(houseCount)
    val rainyHouse = mutableSetOf<Int>()

    for (i in 1..rainyDays) {
        val (s, e) = readLine()!!.split(" ").map { it.toInt() }

        for (j in s..e) {
            waterHeight[j - 1] += 1
            rainyHouse.add(j)
        }

        if (i % 3 == 0) {
            for (j in rainyHouse) {
                waterHeight[j - 1] -= 1
            }
            rainyHouse.clear()
        }
    }

    for (i in 0 until houseCount) {
        house[i] += waterHeight[i]
        print(house[i].toString())
        if (i < houseCount - 1) print(" ")
    }

}