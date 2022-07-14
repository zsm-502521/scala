package collection

/**
 * @author 赵世敏
 * @date 2022/7/13
 * 1208676641@qq.com
 * @description 不可变数组
 */
object ImmutableArray {
  def main(args: Array[String]): Unit = {
    //1 创建数组
    val arr1: Array[Int] = new Array[Int](12)
    // 另一种定义
    val arr2 = Array(1, 2, 3, 4, 5, 6, 7, 8)
    //2 访问元素
    println(arr2(3))
    arr2(2) = 20
    println(arr2(2))
    //3 循环遍历
    for (i <- 0 until arr2.length) {
      println(arr2(i))
    }
    for (i <- arr2.indices) println(arr2(i))
    //直接遍历所有元素
    println("***********")
    for (elem <- arr2) println(elem)
    //迭代器
    println("****************")
    var iter = arr2.iterator
    while (iter.hasNext) {
      println(iter.next())
    }
    //foreach方法
    println("*****************")
    arr2.foreach((elem: Int) => println(elem))
    arr2.foreach(println)

    //转换为string 拼接
    println(arr2.mkString("-"))

    //添加元素 返回新的数组
    val arr3: Array[Int] = arr2 :+ (9)
    println(arr3.mkString("-"))
    //添加到前面
    val arr4: Array[Int] = arr2.+:(0)
    val arr5: Array[Int] = 0 +: arr2 :+ 9
    println(arr4.mkString("-"))
    println(arr5.mkString("-"))


  }
}
