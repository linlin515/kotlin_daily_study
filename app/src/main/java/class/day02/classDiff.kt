package `class`.day02

/**
 *
 *
 *@author LRH
 *@email linruihang@xiongdi.cn
 *@time 2019/7/31 9:08
 */

/**
 * 普通class
 */
class Person(
    val name: String,  //只读（只有get）
    var isMarried: Boolean  //可读、可写（自带set（）、get（））
)

/**
 * 自定义get（）、set（）的class
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        //自定义get（）
        get() = height == width

}


fun main(args: Array<String>) {
    val person = Person("tom", true)
    println("tom is married: ${person.isMarried}")

    val rectangle = Rectangle(10, 10)
    println("the rectangle is square: ${rectangle.isSquare}")
}