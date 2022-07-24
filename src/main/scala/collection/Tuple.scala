package collection

/**
 * @author 赵世敏
 * @date 2022/7/19
 *       1208676641@qq.com
 * @description 元组
 */
object Tuple {
  def main(args: Array[String]): Unit = {
    val tuple: (String, Int, Char, Boolean) = ("hello", 100, 'a', true)
    println(tuple)

    //获取
    println(tuple._1)
    println(tuple._3)
    //下标获取
    println(tuple.productElement(0))

    //遍历元组
    println("*****************")
    for (elem <- tuple.productIterator) print(elem)

    //嵌套元组
    val tuple1: (Int, Int, String, (String, String), Char) = (1, 2, "hi", ("hello", "scala"), 'd')
    println(tuple1)
  }
}
