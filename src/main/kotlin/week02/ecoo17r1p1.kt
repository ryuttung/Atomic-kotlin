package week02

fun main() {
    // 1학년 12달러, 2학년 10달러, 3학년 7달러, 4학년 5달러
    // 50프로는 여행 50프로는 브런치 비용
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    val trip = input.readLine().toInt() // 여행 비용
    if(trip !in 50..5000) throw Throwable("out of range 50..50000 trip: $trip")

    val y1 = input.readLine().toDouble() // 1학년 비율
    val y2 = input.readLine().toDouble() // 2학년 비율
    val y3 = input.readLine().toDouble() // 3학년 비율
    val y4 = input.readLine().toDouble() // 4학년 비율

    val n = input.readLine().toInt() // 학생 수
    if(n !in 4..2000) throw Throwable("out of range 4..2000 n: $n")

    //학년 인원..1.8명 -> 1명으로 반올림 처리?

    var sum = 0

}
