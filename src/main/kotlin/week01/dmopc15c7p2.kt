package week01

fun main() {
// 1주차 강의 예제
    val input = System.`in`.bufferedReader() // 입력 버퍼를 사용하여 성능을 향상시킨다
    val output = System.out.bufferedWriter() //출력 버퍼를 사용하여 성능을 향상시킨다
    val n = input.readLine() // 한 줄을 읽어온다
    var count = 0
    var isWordStart = false
    for (c in n) {
        if (isWordStart) {
            if (c == ' ') {
                isWordStart = false
            }
        } else {
            if (c != ' ') {
                isWordStart = true
                count++
            }
        }
    }
    output.write("$count")
    output.flush() //출력 버퍼를 비운다
}