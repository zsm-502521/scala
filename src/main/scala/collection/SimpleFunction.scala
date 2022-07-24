package collection

/**
 * @author 赵世敏
 * @date 2022/7/22
 *       1208676641@qq.com
 * @description 集合计算
 */
object SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, -8)
    val list1 = List(("a", 1), ("b", 2), ("c", 3), ("d", 4), ("e", -8))
    //    （1）求和
    var sum = 0
    for (elem <- list) {
      sum += elem
    }
    println(sum)
    println(list.sum)
    //    （2）求乘积
    println(list.product)
    //    （3）最大值
    println(list.max)
    println("**********************")
    println(list1.maxBy((tuple: (String, Int)) => tuple._2))
    println(list1.maxBy(_._2)) //简化
    //    （4）最小值
    println(list.min)
    //    （5）排序
    println(list.sorted) //顺序排序
    //逆序排序
    println(list.sorted.reverse)
    println(list.sorted(Ordering[Int].reverse)) // 传入隐式参数

    println(list1.sorted)
    println(list1.sortBy(_._2)(Ordering[Int].reverse))

    //SortWith
    println(list.sortWith((a: Int, b: Int) => {
      a < b
    }))
    println(list.sortWith(_ > _))
    println("=========================")
//    list1.sortWith((a, b), (a, b) => {a < b})


  }
}
