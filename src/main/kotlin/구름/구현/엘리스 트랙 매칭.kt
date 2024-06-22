package 구름.구현


fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ")
    val a = readLine()!!
    var count = 0

    for (b in arr) {
        if (a == b) count++
    }

    print(count)
}