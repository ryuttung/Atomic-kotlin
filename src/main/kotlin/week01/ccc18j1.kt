package week01

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    val n1 = input.readLine().toInt()
    val n2 = input.readLine().toInt()
    val n3 = input.readLine().toInt()
    val n4 = input.readLine().toInt()

    if((n1 == 8 || n1 == 9) && (n4 == 8 || n4 == 9) && (n2 == n3)){
        output.write("ignore")
    }else {
        output.write("answer")
    }
    output.flush()
}