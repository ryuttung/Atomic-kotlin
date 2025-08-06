package week01

import kotlin.text.iterator

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //1. 코드의 출력 결과는? 7.5
    val a = 5
    val b = 2.5
    println(a + b)

    //2. 코드의 결과는? Hello kotlin!
    val s = "kotlin"
    println("Hello $s!")

    //val 식별자: 타입 = 초기화
    //3.아래 코드에서 사용된 타입은 무엇인가요? Boolean
    val isDone = false

    //4. Char 타입으로 한 글자 'A'를 변수로 선언하세요.
    val ch: Char = 'A'

    //5. val x = 1.23 은 어떤 타입으로 추론되나요?
    // Double

    //6. Int의 최대값을 저장하는 상수는 무엇인가요?
    // Int.MAX_VALUE

    //7. 삼중 큰따옴표를 사용하면 어떤 장점이 있나요?
    //여러 줄에 걸친 문자열을 만들거나 특수 문자가 들어간 문자열 작성 가능

    //8. 다음 코드에서 오류 없이 출력될 수 있도록 수정하세요:
    // x = 1
    // println("Value is: $x + 1")
    val x = 1
    println("Value is: ${x + 1}")


    //9. 점수가 90점 이상이면 A, 80점 이상이면 B, 아니면 C로 출력하는 if 식을 작성하세요.
    val score = 65 //예시용
    if (score >= 90)
        println("A")
    else if (score >= 80)
        println("B")
    else
        println("C")

    // 10. 아래 코드를 for 문으로 바꾸세요:
    // println(1)
    // println(2)
    // println(3)
    for (v in 1..3) {
        println(v)
    }

    //p.88 예제
    //    var i = 1
    //    println(i++ + ++i) //2 + 2, i=3
    //    println(i++ + 10)//3 + 10, i=4
    //    println(20 * ++i)//20*5

    // 11. 다음 while 반복문이 몇 번 반복되는지 예측하세요: 4번
    // var i = 0
    // while (i < 4) { 0 1 2 3 4
    // println(i) 0 1 2 3
    // i++ 0 1 2 3
    // } 1 2 3 4

    // 12. 1부터 10까지 짝수만 출력하는 코드를 작성하세요.
    for (v in 1..10) {
        if (v % 2 == 0)
            print("$v ")
    }
    println()
    // 13. val s = "banana"에서 "a"가 몇 번 등장하는지 세는 코드를 작성하세요.
    var sum1 = 0
    for (c in "banana") {
        if (c == 'a') {
            sum1 = sum1 + 1
        }
    }
    println(sum1)


    // 14. for 루프를 사용해 다음을 출력하세요.
    // 1 4 9 16 25
    for(d in 1..5){
        print("${d*d} ")
    }

    println()


    // 15. 다음 코드의 결과를 예측하세요. odd
    // val n = 7
    // val result = if (n % 2 == 0) "even" else "odd"
    // println(result)


    // 16. 1부터 10까지 더한 합을 구하세요.
    var sum2 = 0
    for (y in 1..10) {
        sum2 = sum2 + y
    }
    println(sum2)

    //17. 10에서 1까지 거꾸로 출력하는 for문을 작성하세요.
    for (e in 10 downTo 1)
        print("$e ")

}