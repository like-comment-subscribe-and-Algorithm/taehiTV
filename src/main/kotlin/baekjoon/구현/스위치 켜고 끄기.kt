package baekjoon.구현

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val switchCount = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val studentCount = br.readLine().toInt()

    repeat(studentCount) {
        val (sex, num) = br.readLine().split(" ").map { it.toInt() }

        if (sex == 1) {
            for (i in 1..switchCount / num) {
                arr[num * i - 1] = 1 - arr[num * i - 1]
            }
        } else {
            var flag = true
            var i = 1

            arr[num - 1] = 1 - arr[num - 1]
            while (flag) {
                if (num - i - 1 in 0 until switchCount && num + i - 1 in 0 until switchCount) {
                    if (arr[num - i - 1] == arr[num + i - 1]) {
                        arr[num - i - 1] = 1 - arr[num - i - 1]
                        arr[num + i - 1] = 1 - arr[num + i - 1]
                        i += 1
                    } else {
                        flag = false
                    }
                } else {
                    flag = false
                }
            }
        }
    }

    for (i in arr.indices) {
        bw.write("${arr[i]} ")
        if ((i + 1) % 20 == 0) {
            bw.newLine()
        }
    }

    if (arr.size % 20 != 0) {
        bw.newLine()
    }

    bw.flush()
    bw.close()
}