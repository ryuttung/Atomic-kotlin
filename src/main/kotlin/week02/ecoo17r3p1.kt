package week02

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    val F = input.readLine().toInt() //가게 수
    if(F !in 4..130) throw Throwable("out of range 4..130 F: $F")
    val D = input.readLine().toInt() //기록 수
    if(D !in 2..4745) throw Throwable("out of range 2..4745 D: $D")

    //D일 동안 F개의 가게에서 판매한 기록
    val records = Array(D) { IntArray(F) }

}