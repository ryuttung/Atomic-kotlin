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

    //코드 리뷰
//    var i = 0
//    while (i < n.length) {
//        if(n[i] !in "ABC") throw Throwable("Invalid character $n")
//    }
//
//    var pos0 = 1 //컵이 있는 자리
//    var pos1 = 0
//    var pos2 = 0
//
//    for(c in n) {
//        when(c) {
//            'A' -> {
//                val temp = pos0
//                pos0 = pos1
//                pos1 = temp
//            }
//            'B' -> {
//                val temp = pos1
//                pos1 = pos2
//                pos2 = temp
//            }
//            'C' -> {
//                val temp = pos0
//                pos0 = pos2
//                pos2 = temp
//            }
//        }
//    }
//
//    val result = when {
//        pos0 == 1 -> "1"
//        pos1 == 1 -> "2"
//        pos2 == 1 -> "3"
//        else -> throw Throwable("fulfill partition")
//    }
//
//    output.write(result)


    var ball = 1
    for (i in 0..n.length - 1) {
        if (n[i] == 'A') {
            if (ball == 1) {
                ball = 2
            } else if (ball == 2) {
                ball = 1
            }
        } else if (n[i] == 'B') {
            if (ball == 2) {
                ball = 3
            } else if (ball == 3) {
                ball = 2
            }
        } else if (n[i] == 'C') {
            if (ball == 1) {
                ball = 3
            } else if (ball == 3) {
                ball = 1
            }
        } else {
            return
        }
    }
    output.write("$ball")
    output.flush()

}