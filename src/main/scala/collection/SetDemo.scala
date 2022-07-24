package collection

/**
 * @author 赵世敏
 * @date 2022/7/15
 *       1208676641@qq.com
 * @description  不可变set
 */
object SetDemo {
  def main(args: Array[String]): Unit = {
    //创建
    val set = Set(1, 2, 3, 4, 1, 2, 4)
    println(set)
    //添加
    val set1: Set[Int] = set + (5)
    println(set1)
    //合并set
    var set2 =Set(12,312,321,31,41,4,1)
    var set3 =set2++set
    val set4: Set[Int] = set3 - 2
    println(set3)
    println(set4)
  }
}
