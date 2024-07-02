package 구름.구현

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val maxArr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val numArr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val k = readLine()!!.toInt()

    repeat(k) {
        numArr[n-1] += 1

        for (i in n-1 downTo 0) {
            if (numArr[i] > maxArr[i]) {
                numArr[i] = 0
                if (i != 0) numArr[i-1] += 1
            }
        }
    }

    println(numArr.joinToString(""))

}