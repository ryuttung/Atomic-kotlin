package week01

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()
    val r = input.readLine().toInt()
    val h = input.readLine().toInt()

    if(r !in 1..100 && h !in 1..100) {
        return
    }

    val v: Double = (1.0/3.0) * Math.PI * r * r * h
    output.write(String.format("%.2f",v))
    output.flush()
}