package week01

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    val n1 = input.readLine().toInt() // 제공 바이트
    val n2 = input.readLine().toInt() // 몇 개월 사용할지

    if(n1 !in 1..100 && n2 !in 1..100){
        return
    }

    var sum = 0
    for(i in 0.. n2 -1 ){
        val data = input.readLine().toInt()
        sum = sum + data
    }

    val result = n1*n2 - sum + n1
    output.write("$result")
    output.flush()
}