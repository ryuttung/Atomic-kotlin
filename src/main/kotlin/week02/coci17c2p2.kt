package week02

fun main() {

    val input = System.`in`.bufferedReader()

    val split = input.readLine().split(" ")
    val K = inputInt(split[0], 1..100_000) //단어 개수
    val N = inputInt(split[1], 1..100_000) //Zig가 말하는 횟수

    val dictMap = mutableMapOf<Char, MutableList<String>>() //단어 목록
    val countMap = mutableMapOf<String, Int>()

    var i = 0
    while (i < K) {
        val word = input.readLine()
        if (word.length > 21) throw Throwable("word length over 21")

        val firstChar = word[0] //첫 글자만 따서 맵핑
        if (dictMap.containsKey(firstChar)){
            dictMap[firstChar]!!.add(word) //맵은 무조건 null 아니라는 거 해줘야함 !!
        }else {
            dictMap[firstChar] = mutableListOf(word) //첫글자 없으면 리스트 새로 만들어줘야 함
        }

        countMap[word] = 0 //초기화
        i++
    }

    for (key in dictMap.keys){
        //사전 오름차순
        dictMap[key]!!.sort()
    }

    var j = 0
    while (j < N) {
        val zig = input.readLine()[0] //Zig가 말하는 첫 글자

        val enableWords = dictMap[zig] ?: throw Throwable("No words found for zig: $zig")

        // 1. 적게 불린 단어
        // 2. 그 수가 같다면 사전순으로 앞서는 단어
        // 단어들을 순회하면서 그 단어가 기준 단어보다 덜 불렸다면 그 단어를 기준 단어로 교체

        var zag = enableWords[0]
        var zagCount = countMap[zag] ?: throw Throwable("No count found for zag: $zag")

        for (i in 1 until enableWords.size) {
            val word = enableWords[i]
            val wordCount = countMap[word] ?: throw Throwable("No count found for word: $word")
        if (wordCount < zagCount) {
            zag = word
            zagCount = wordCount
        }
    }
        countMap[zag] = countMap[zag]!! + 1
        println(zag)
        j++
    }

}