package week01

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    val a1 = input.readLine().toInt()
    val a2 = input.readLine().toInt()
    val a3 = input.readLine().toInt()
    val b1 = input.readLine().toInt()
    val b2 = input.readLine().toInt()
    val b3 = input.readLine().toInt()

    val apple = a1 * 3 + a2 * 2 + a3 * 1
    val banana = b1 * 3 + b2 * 2 + b3 * 1
    val result = apple - banana

    if(result  > 0) {
        output.write("A")
    } else if(result < 0) {
        output.write("B")
    } else {
        output.write("T")
    }

    output.flush()
    //1. 3개는 apple팀
    //2. 3개는 banana팀
    // apple팀은 10*3 + 3*2 + 7*1
    // banana팀은 8*3 + 9*2 + 6*1
    // 두 팀의 차이를 계산해서 apple팀이 더 크면 char A, banana면 char B, 나머지는 char T를 출력
}