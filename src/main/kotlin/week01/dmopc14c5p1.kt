package week01

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()
    val r = input.readLine().toInt()
    val h = input.readLine().toInt()

    if (r !in 1..100 && h !in 1..100) {
        return
    }

    val v: Double = (1.0 / 3.0) * Math.PI * r * r * h
    output.write(String.format("%.2f", v))
    output.flush()
}

//코드 리뷰
//    val n0 = input.readLine()
//    val r = n0.toIntOrNull() ?: throw Throwable("invalid int n0: $n0") //n0이 null이면 throw 뒤 실행
//    if(r !in 1..100) throw Throwable("out of range 0..100 r: $r")
//
//    val n1 = input.readLine()
//    val h = n0.toIntOrNull() ?: throw Throwable("invalid int n0: $n1") //n0이 null이면 throw 뒤 실행
//    if(h !in 1..100) throw Throwable("out of range 0..100 r: $h")
//    val core = Math.PI * r * r * h / 3

