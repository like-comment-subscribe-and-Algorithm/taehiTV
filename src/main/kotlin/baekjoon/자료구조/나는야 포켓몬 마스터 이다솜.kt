package baekjoon.자료구조

// boj 1620

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val pokemonName = mutableMapOf<Int, String>()
    val pokemonNumber = mutableMapOf<String, Int>()

    repeat(n) { index ->
        val name = br.readLine()
        pokemonName[index + 1] = name
        pokemonNumber[name] = index + 1
    }

    repeat(m) {
        val input = br.readLine()
        if (input.toIntOrNull() != null) {
            bw.write("${pokemonName[input.toInt()]}\n")
        } else {
            bw.write("${pokemonNumber[input]}\n")
        }
    }

    bw.flush()
    bw.close()
}