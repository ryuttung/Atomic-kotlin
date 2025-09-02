package week02

import kotlin.math.abs
import kotlin.math.round

fun main() {
    // 1학년 12달러, 2학년 10달러, 3학년 7달러, 4학년 5달러
    // 50프로는 여행 50프로는 브런치 비용
    val input = System.`in`.bufferedReader()

    val TRIPS = 10
    var o = 0
    while (o < TRIPS) {
        val trip = input.readLine().toInt() // 1. 여행 비용
        if(trip !in 50..50000) throw Throwable("out of range 50..50000 trip: $trip")

        val pointLine = input.readLine().split(" ") //2. 학년별 비율
        if (pointLine.size != 4) throw Throwable("pointLine size is not 4 pointLine: $pointLine")
        val points = mutableListOf<Double>()
        for (p in pointLine){
            val point = p.toDouble()
            if (point !in 0.0..1.0) throw Throwable("out of range 0..1 point: $point")
            points.add(point)
        }

        var pointSum = 0.0
        for (p in points) {
            pointSum += p
        }
        if(abs(pointSum - 1.0) > 1e-9) throw Throwable("pointSum is not 1.0 pointSum: $pointSum")

        val N = input.readLine().toInt() // 3. 학생 수

        val students = mutableListOf<Int>()
        var studentSum = 0
        for (p in points) {
            val size = (N * p).toInt()
            students.add(size)
            studentSum += size
        }

        val remain = N - studentSum
        val maxPointIndex = points.indexOf(points.max()) // 가장 비율이 높은 학년
        students[maxPointIndex] += remain // 남은 인원 가장 비율이 높은 학년에 더함

        val price = listOf<Int>(12, 10, 7, 5) // 학년별 가격

        var totalMoney = 0
        var i = 0
        while (i < 4) {
            val s = students[i]
            val p = price[i]
            totalMoney += s * p
            i++
        }

        if (totalMoney * 0.5 < trip) {
            println("YES")
        } else {
            println("NO")
        }

        o++
    }
}
