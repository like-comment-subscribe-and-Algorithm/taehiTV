package programmers.구현

class `직사각형 별찍기` {
    fun main(args: Array<String>) {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        repeat(b) {
            repeat(a) {
                print("*")
            }
            println()
        }
    }
}