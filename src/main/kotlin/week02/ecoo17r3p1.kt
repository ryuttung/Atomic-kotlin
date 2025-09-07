package week02
/*
* 하루 매출 13배수: 모든 가맹점 보너스
* 가맹점 매출 13배수: 해당 가맹점 보너스
* */
fun main() {
    val input = System.`in`.bufferedReader()

    val datasets = 10
    val bonuses: MutableList<Int> = mutableListOf()
    var i = 0
    while (i < datasets) {
        val split = input.readLine().split(" ")
        if (split.size != 2) throw Throwable("split size not 2: ${split.size}")

        val F = inputInt(split[0], 1..130) //가맹점 수
        val D = inputInt(split[1], 2..4745) //일 수

        val sales = mutableListOf<Int>() //각 가맹점 별 판매량의 합을 담아주는 리스트
        for (j in 0 until F) {
            sales.add(0) //가맹점 수만큼 0으로 초기화
        }

        var result = 0 // 결과를 담아줄 변수

        var day = 0
        while (day < D) {
            val daySales = input.readLine().split(" ")
            if (daySales.size != F) throw Throwable("daySales size not F: ${daySales.size} != $F")

            var dailySum = 0 //하루 매출 합
            for (k in 0 until F) {
                val sale = inputInt(daySales[k], 0..13000)
                dailySum += sale //하루 매출 합
                sales[k] += sale //각 가맹점 별 판매량의 합
            }

            if (dailySum % 13 == 0) {
                result  += dailySum / 13
            }
            day++
        }

        for (f in 0 until F) {
            val s = sales[f]
            if (s % 13 == 0) {
                result += s / 13
            }
        }
        println(result)
        i++
    }
}
