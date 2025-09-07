package week02

fun inputInt(v: String, range: IntRange): Int {
    val result = v.toIntOrNull() ?: throw Throwable("Invalid integer: $v")
    if (result !in range) throw Throwable("out of range ${range.first}..${range.last} : $result")
    return result
}