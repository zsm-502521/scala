package function

/**
 * @author 赵世敏
 * @date 2022/6/17
 *       1208676641@qq.com
 * @description
 */
object CollectionOperation {
  def main(args: Array[String]): Unit = {
    //定义一个数组
    val arr: Array[Int] = Array(12, 33, 4, 5, 72, 26, 25)

    //对数组进行处理 将操作抽象出来 处理完毕之后的结果放回一个新的数组
    def arrayOperations(array: Array[Int], operation: Int => Int): Array[Int] = {
      for (elem <- array) yield operation(elem)
    }

    //定义一个操作
    def addone(elem: Int): Int = {
      elem + 1
    }

    //调用函数
    val ints: Array[Int] = arrayOperations(arr, addone)
    println(ints)
    println(ints.length)
    println(ints.mkString(",")) //分隔符
    //传入匿名函数  结果 *2
    val ints1: Array[Int] = arrayOperations(arr, elem=> elem * 2) //或者 _ * 2
    println(ints1)
    println(ints1.mkString(","))
  }
}