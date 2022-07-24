package collection

import scala.collection.mutable.ListBuffer

/**
 * @author 赵世敏
 * @date 2022/7/15
 *       1208676641@qq.com
 * @description 可变列表
 */
object ListBufferDemo {
  def main(args: Array[String]): Unit = {
    //1 创建listbuffer
    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    val list2: ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
    println(list1)
    println(list2)

    //2 添加元素
    list1.append(11)
    list1.insert(1, 22, 33)
    list2.prepend(0)
    println(list1 + "\n" + list2)
    1 +=: 2 +=: list2 += 5 += 6
    println(list2)
    //3 合并list
    val list3: ListBuffer[Int] = list1 ++ list2
    println(list3)
    list1 ++= list2 //list1 改变    如果使用的是 ++=: 则是list2改变
    println(list1 + "\n" + list2)

    //4 修改元素
    list2(0) = 0
    println(list2)
    list2.update(1,20)
    println(list2)
    //5 删除元素
    list2.remove(0)
    list2.remove(0,2)
    list2-= 6
    println(list2)
  }
}
