package collection

/**
 * @author 赵世敏
 * @date 2022/7/23
 *       1208676641@qq.com
 * @description 高级函数 reduce
 */
object SeniorCollectionFunctionReduce {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    // TODO: reduce
    println(list.reduce((a: Int, b: Int) => a + b))
    println(list.reduceLeft(_ + _))
    println(list.reduceRight(_ + _))

    val list1 = List(2, 3, 46, 78)
    println(list1.reduce(_ - _))
    println(list1.reduceLeft(_ - _))
    println(list1.reduceRight(_ - _))   // 2-(3-(46-78))

    //todo fold  有初始值
    println(list.fold(10)(_ + _))
    println(list.foldLeft(10)(_ - _))
    println(list1.foldRight(10)(_ - _))    //2-(3-(46-(78-10)))
  }
}
