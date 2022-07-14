package collection

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @author 赵世敏
 * @date 2022/7/13
 *       1208676641@qq.com
 * @description 可变数组
 */
object ArrayBuffer {

  def main(args: Array[String]): Unit = {

    //1 创建可变数组
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    //如果对象名为ArrayBuffer 会默认调用当前对象
    val arr2 = scala.collection.mutable.ArrayBuffer.apply(1, 2, 3, 4)
    println(arr1.mkString(","))
    println(arr1)
    println(arr2)

    //2 访问数组元素
    println(arr2(2))
    arr2(2) = 30
    println(arr2)

    //3 添加元素
    val newarr1: ArrayBuffer[Int] = 10 +: arr1 :+ 12
    println(newarr1)

    arr1 += 18
    println(arr1)

    //末尾添加 append  前面添加 perend
    arr1.append(99)
    arr1.prepend(1)
    arr1.insert(2, 20, 21) //1 的索引位置
    println(arr1)
    //添加数组
    arr1.insertAll(2, arr2)
    println(arr1)

    //4 删除元素
    arr1.remove(2)
    println(arr1)
    //从下标0开始  删2个
    arr1.remove(0, 2)
    println(arr1)
    arr1 -= 99
    println(arr1)

    //5 可变数组转换为不可变数组  toArray method
    val arr3: ArrayBuffer[Int] = scala.collection.mutable.ArrayBuffer(1, 21, 2, 3, 4, 6, 7)
    val newarr3: Array[Int] = arr3.toArray
    println(arr3)
    println(newarr3)
    newarr3.foreach((elem: Int) => print(elem))

    //不可变数组转换为可变数组  toBUffer method
    val buffer: mutable.Buffer[Int] = newarr3.toBuffer
    println(buffer)
    println(newarr3.mkString("Array(", ", ", ")"))
    println(buffer == newarr3.toSeq)


  }
}