package collection

/**
 * @author 赵世敏
 * @date 2022/7/15
 *       1208676641@qq.com
 * @description 不可变列表list
 */
object ListDemo {
  def main(args: Array[String]): Unit = {
    //创建一个list
    val list1 = List(1, 2, 3, 4, 5)
    //访问元素
    println(list1)
    println(list1(2))
    list1.foreach(println)

    //添加元素
    val list2: List[Int] = list1.+:(0)
    println(list2)
    println(list1)
    println(list1 == list2)
    //添加到前面
    println(list1.::(6))
    val list3 = Nil.::(0)
    println(list3)
    //也是创建新list 可以直接添加
    val list4 = 1 :: 2 :: 3 :: Nil
    println(list4)
    //基于list追加list
    val list5 = list4 :: list3
    println(list5)
    //合并list :::  或者使用 ++
    val list6 = list4 ::: list3
    println(list6)
  }
}
