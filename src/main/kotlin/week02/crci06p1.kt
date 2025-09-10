package week02

fun main() {
    val input = System.`in`.bufferedReader()

    val bard = 1

    val N = inputInt(input.readLine(), 2..100) //인원 수
    val E = inputInt(input.readLine(), 1..50) //일 수

    val knows = mutableListOf<MutableSet<Int>>() //인덱스 번호 = 주민 번호, set = 주민이 알고 있는 노래들
    repeat(N+1){
        knows.add(mutableSetOf())
    }

    var songSize = 0
    var i = 0
    while (i < E){
        val split = input.readLine().split(" ")
        val K = inputInt(split[0], 2..N)

        //인덱스 번호 = 주민 번호
        val peoples = mutableListOf<Int>()
        for(j in 1..K){
            val p = inputInt(split[j], 1..N)
            peoples.add(p)
        }

        if(bard in peoples){
            songSize++
            for(p in peoples){
                knows[p].add(songSize)
            }
        } else {
            val allSongs = mutableSetOf<Int>() //모든 사람들이 알고있는 노래를 담는 곳

            for(p in peoples){
                allSongs.addAll(knows[p])
            }

            //모든 노래 공유
            for(p in peoples){
                knows[p].clear()
                knows[p].addAll(allSongs)
            }
        }
        i++
    }
    for(v in 1..N){
        if(knows[v].size == songSize){
            println(v)
        }
    }

}