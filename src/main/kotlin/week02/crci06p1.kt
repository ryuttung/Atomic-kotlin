package week02

fun main() {
    val input = System.`in`.bufferedReader()

    //bard(1)번이 오면 새로운 노래를 가지고 온다
    //앞은 참여 인원 수, 뒤는 참여한 인원 번호

    val N = input.readLine().toInt()
    if(N !in 2..100) throw Throwable("out of range 2..100 F: $N")

    val E = input.readLine().toInt()
    if(E !in 1..50) throw Throwable("out of range 1..50 E: $E")

    var i = 0
    while(i < E) {
        val line = input.readLine().split(" ")
        val K = line[0].toInt()
        if(K !in 2..N) throw Throwable("out of range 2..$N K: $K")



        i++
    }

}