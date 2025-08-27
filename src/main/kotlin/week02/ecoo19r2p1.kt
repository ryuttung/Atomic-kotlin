package week02

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    repeat(10) {
        val N = input.readLine().toInt()
        val emailSet = mutableSetOf<String>()

        val i = 0
        repeat(N) {
            val email = input.readLine().trim().lowercase()

            val idPart = email.substringBefore('@')
            val domain = email.substringAfter('@')

            val id = idPart.substringBefore('+').replace(".", "")

            val realEmail = "$id@$domain"
            emailSet.add(realEmail)
        }
        println(emailSet.size)
    }

}