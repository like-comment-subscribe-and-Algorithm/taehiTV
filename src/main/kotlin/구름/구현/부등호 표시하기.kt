package 구름.구현

fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }

    val op1 = when {
        a > b -> ">"
        a == b -> "=="
        else -> "<"
    }

    val op2 = when {
        b > c -> ">"
        b == c -> "=="
        else -> "<"
    }

    val result = "$a$op1$b$op2$c"
    println(result)
}