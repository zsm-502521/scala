package collection

/**
 * @author 赵世敏
 * @date 2022/7/20
 *       1208676641@qq.com
 * @description 衍生集合
 */
object DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val list1 = List(1, 2, 3, 6, 7, 8)
    //    （1）获取集合的头 有序集合
    println(list.head)
    //    （2）获取集合的尾（不是头的就是尾） 除了第一个
    println(list.tail)
    val tail: List[Int] = list.tail
    println(tail.tail)
    //    （3）集合最后一个数据
    println(list.last)
    //    （4）集合初始数据（不包含最后一个）  除了最后一个
    println(list.init)
    //    （5）反转
    println(list.reverse)
    //    （6）取前（后）n 个元素
    println(list.take(3)) //取前三个
    println(list.takeRight(3)) //取后三个
    //    （7）去掉前（后）n 个元素
    println(list.drop(2))
    println(list.dropRight(2))
    //    （8）list并集  union 等价与 :::
    val ints: List[Int] = list.union(list1)
    val list2: List[Int] = list ::: list1
    println(ints)
    println(list2)
    //todo 如果是set集合 会去重  union 等价于++
    val set = Set(1, 2, 3, 4, 5)
    val set1 = Set(1, 2, 3, 6, 7, 8)
    val set2: Set[Int] = set1.union(set)
    val set3: Set[Int] = set ++ set1
    println(set2)
    println(set3)
    //    （9）交集   都有的元素
    println(list.intersect(list1))
    //    （10）差集
    println(list.diff(list1)) //属于list 不属于list2
    println(list1.diff(list)) //属于list1 不属于list
    //    （11）拉链  变成二元组
    println(list.zip(list1))
    println(list1.zip(list))
    //    （12）滑窗
    for (elem <- list.sliding(3)) {
      println(elem)
    }
    //窗口也为3 步长为2
    for (elem <- list.sliding(3, 2)) {
      println(elem)
    }
  }
}
