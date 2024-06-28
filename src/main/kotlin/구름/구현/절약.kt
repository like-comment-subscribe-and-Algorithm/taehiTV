package 구름.구현

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var asset = 0L

    repeat(n) {
        val (c, v) = readLine()!!.split(" ")
        when (c) {
            "in" -> asset += v.toLong()
            "out" -> {
                val amount = v.toLong()
                if (asset < amount) {
                    println("fail")
                    return
                }
                asset -= amount
            }
        }
    }

    println("success")
}
