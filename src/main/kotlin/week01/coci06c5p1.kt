package week01

fun main() {
    // A: 왼쪽과 가운데 교환
    // B: 가운데와 오른쪽 교환
    // C: 왼쪽과 오른쪽 교환
    // 1: 왼쪽, 2: 가운데, 3: 오른쪽
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    val n = input.readLine()
    if (n.length > 50) {
        return
    }

    var ball = 1
    for (i in 0..n.length - 1) {
        if (n[i] == 'A') {
            if (ball == 1) {
                ball = 2
            }else if (ball == 2) {
                ball = 1
            }
        } else if (n[i] == 'B') {
            if (ball == 2) {
                ball = 3
            }else if(ball == 3) {
                ball = 2
            }
        } else if (n[i] == 'C') {
            if (ball == 1) {
                ball = 3
            }else if(ball == 3){
                ball = 1
            }
        } else {
            return
        }
    }
    output.write("$ball")
    output.flush()

}