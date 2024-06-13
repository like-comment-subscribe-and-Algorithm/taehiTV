package 구름.구현

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    repeat(n) {
        val word = br.readLine()
        val mirroredWord = mutableListOf<String>()

        for (i in word.reversed()) {
            mirroredWord.add(mirroring(i.toString()))
        }

        val result = if (mirroredWord.joinToString("") == word) {
            "Mirror"
        } else {
            "Normal"
        }

        bw.write(result)
        bw.newLine()

    }

    bw.flush()
    bw.close()

}

fun mirroring(word: String) =
    when (word) {
        "b" -> "d"
        "d" -> "b"
        "i" -> "i"
        "l" -> "l"
        "m" -> "m"
        "n" -> "n"
        "o" -> "o"
        "p" -> "q"
        "q" -> "p"
        "s" -> "z"
        "z" -> "s"
        "u" -> "u"
        "v" -> "v"
        "w" -> "w"
        "x" -> "x"
        else -> "-"
    }
