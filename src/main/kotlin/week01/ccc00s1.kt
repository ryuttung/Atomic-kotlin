package week01

fun main() {

    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    var quarter = input.readLine().toInt()
    var machine1 = input.readLine().toInt()
    var machine2 = input.readLine().toInt()
    var machine3 = input.readLine().toInt()
    var playCount = 0 // 총 플레이 횟수

    if (quarter !in 1..1000) {
        return
    }

    while(quarter > 0) {
        quarter--
        playCount++
        machine1++
        if(machine1 == 35){
            quarter += 30
            machine1 = 0 // 30쿼터 지급 후 초기화
        }

        if(quarter == 0){
            break
        }

        quarter--
        playCount++
        machine2++
        if(machine2 == 100){
            quarter += 60
            machine2 = 0 // 60쿼터 지급 후 초기화
        }
        if(quarter == 0){
            break
        }

        quarter--
        playCount++
        machine3++
        if(machine3 == 10){
            quarter += 9
            machine3 = 0
        }
        if(quarter == 0){
            break
        }
    }
    output.write("Martha plays $playCount times before going broke.")
    output.flush()


}