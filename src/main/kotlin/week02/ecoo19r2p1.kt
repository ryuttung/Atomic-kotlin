package week02

fun main() {
    val input = System.`in`.bufferedReader()

    val datasets = 10
    var i = 0

    while (i < datasets) {
        val N = if (i < 6) {
            inputInt(input.readLine(), 1..100)
        } else {
            inputInt(input.readLine(), 1..100_000)
        }

        val emailSet = mutableSetOf<String>()

        var j = 0
        while (j < N) {
            val email = input.readLine()
            if (email.length !in 1..30) throw Throwable("Invalid email length")

            val idPart = email.trim().lowercase().substringBefore('@')
            val domain = email.trim().lowercase().substringAfter('@')

            val id = idPart.substringBefore('+').replace(".", "")

            val realEmail = "$id@$domain"
            emailSet.add(realEmail)
            j++
        }

        println(emailSet.size)
        i++
    }
}