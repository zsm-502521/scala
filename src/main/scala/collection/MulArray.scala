package collection

/**
 * @author 赵世敏
 * @date 2022/7/14
 *       1208676641@qq.com
 * @description 多维数组
 */
object MulArray {
  def main(args: Array[String]): Unit = {
    //1 创建二维数组 2行3列
    val array: Array[Array[Int]] = Array.ofDim(2, 3)

    //2 访问元素
    array(0)(2) = 10
    array(1)(0) = 20
    println(array.mkString("Array(", ", ", ")"))
    println(array.length)
    println(array(0).length)
    //双重循环
    for (i <- array.indices; j <- 0 until array(i).length) {
      print(array(i)(j) + "\t")
      if (j == array(i).length - 1) {
        println()
      }
    }
    println("*******************")
    array.foreach(line => line.foreach(print))
    println()
    println("*******************")
    array.foreach(_.foreach(print))

  }
}
