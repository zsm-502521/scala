package collection

import scala.collection.mutable

/**
 * @author 赵世敏
 * @date 2022/7/15
 *       1208676641@qq.com
 * @description 可变set
 */
object MutableSet {
  def main(args: Array[String]): Unit = {
    //创建 establish
    val set1: mutable.Set[Int] = mutable.Set(12, 21, 3, 12, 3, 5)
    println(set1)

    //add element
    val set2: mutable.Set[Int] = set1 + 1
    println(set2)
    set1 += 99
    println(set1)
    val bool: Boolean = set1.add(88)
    val bool1: Boolean = set1.add(99)
    println(bool)
    println(bool1)
    println(set1)

    //delete element
    set1 -= 12
    println(set1)
    val bool2: Boolean = set1.remove(88)
    println(bool2)
    println(set1)

    //merge set collection
    val set3 = mutable.Set(1, 2, 2, 3, 123, 4, 5, 76, 6)
    val set4 = set3 ++ set1
    println(set1)
    println(set2)
    println(set4)
    //将set3的值追加到set1
    set1++=set3
    println(set1)



  }
}
