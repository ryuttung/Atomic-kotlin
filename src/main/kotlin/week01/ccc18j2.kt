package week01

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    val n1 = input.readLine().toInt()
    val n2 = input.readLine()
    val n3 = input.readLine()

    if (n1 !in 1..100){
        return
    }

    var count = 0

    for (i in 0..n2.length -1){
        if(n2[i] == 'C' && n2[i] == n3[i]){
            count++
        }
    }
    output.write("$count")
    output.flush()
}