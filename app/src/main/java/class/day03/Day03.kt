package `class`.day03

import java.io.BufferedReader

/**
 *
 *
 *@author LRH
 *@email linruihang@xiongdi.cn
 *@time 2019/8/19 17:54
 */

class Day03 {

    //集合测试
    fun listTest_01() {
        val list = arrayListOf("1", "2", "3")
        for ((index, element) in list.withIndex()) {
            print("$index:$element\n")
        }
    }


    //in when 关键字
    fun in_when_test_01(c: Char) = when (c) {
            in '0'..'9' -> "It is digit"
            in 'a'..'z' -> "It is a letter"
            else -> "unknow char type"
        }


    //in 用于String(可用原因：实现了Comparable接口)
    //实现Comparable接口都能使用in操作符
    fun in_test_02(str: String) {
        println(str in "java".."scala")
    }


    //异常
    fun readNumber(reader: BufferedReader) {
        val number = try {
            Integer.parseInt(reader.readLine())
        } catch (e: Exception) {
            //有异常则等于null
            null
        }
        println("the nummber is $number")
    }


}
