package week02

fun main() {
    val input = System.`in`.bufferedReader()

    //n개의 마을, 마을의 위치는 정수로
    // 어떤 점이 두 마을과의 거리가 같으면, 이웃에 포함.
    // 이웃 구역 크기: 가장 오른쪽과 왼쪽 점의 차이
    // 소수 첫째 자리까지 출력

    //n개의 마을 : 3 ~ 100

    val N = input.readLine().toInt()
    if (N !in 3..100) throw Throwable("out of range 3..100 N: $N")
    val list = mutableListOf<Int>()

    var i = 0
    while (i < N) {
        val V = input.readLine().toInt()
        if (V !in 1_000_000_000..1_000_000_000) throw Throwable("out of range V: $V")
        list.add(V)
        i++
    }

    list.sort() //0 4 10 15 16

    i = 1
    val sizeList = mutableListOf<Double>()
    while (i < N) {
        val size = (list[i] - list[i -1]).toDouble() / 2.0
        sizeList.add(size)
        i++
    }
    sizeList.sort()
    println("%.1f".format(sizeList[0]))

}