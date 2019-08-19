package `class`

import `class`.day03.Day03
import java.io.BufferedReader
import java.io.StringReader

/**
 *
 *
 *@author LRH
 *@email linruihang@xiongdi.cn
 *@time 2019/7/30 19:14
 */

fun main(args: Array<String>) {
    //比较两个数大小
//    println("the bigger is ${max(12, 333)}")

    //day03 测试
    val day03 = Day03()
    day03.listTest_01()

    //测试in和 when关键字
    val ret_01 = day03.in_when_test_01('1')
    println(ret_01)
    val ret_02 = day03.in_when_test_01('d')
    println(ret_02)
    val ret_03 = day03.in_when_test_01('.')
    println(ret_03)

    //测试in关键字
    day03.in_test_02("Kotlin")

    //测试异常捕获
    day03.readNumber(BufferedReader(StringReader("not a number")))

    day03.readNumber(BufferedReader(StringReader("123456")))



}