package week01

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    val a1 = input.readLine().toInt()
    //  val a1 = input.readLine().toIntOrNull() ?: throw Throwable ("invalid int a1")
    val a2 = input.readLine().toInt()
    val a3 = input.readLine().toInt()
    val b1 = input.readLine().toInt()
    val b2 = input.readLine().toInt()
    val b3 = input.readLine().toInt()

    val apple = (a1 * 3) + (a2 * 2) + a3
    val banana = (b1 * 3) + (b2 * 2) + b3
    // val result = apple - banana
//    if(result  > 0) {
//        output.write("A")
//    } else if(result < 0) {
//        output.write("B")
//    } else {
//        output.write("T")
//    }

    //코드리뷰
    val result = when {
        apple > banana -> "A"
        apple < banana -> "B"
        else -> "T"
    }

    output.write(result)
    output.flush()

}