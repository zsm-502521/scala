package collection

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * @author 赵世敏
 * @date 2022/7/25
 *       1208676641@qq.com
 * @description 可变队列  不可变队列
 */
object MutableQueue {
  def main(args: Array[String]): Unit = {
    //可变队列
    val queue = new mutable.Queue[String]()
    //入队
    queue.enqueue("a", "b", "c")
    println(queue)
    //出队  先进先出
    println(queue.dequeue())
    println(queue)
    println(queue.dequeue())
    println(queue)
    println(queue.dequeue())
    println(queue)
    queue.enqueue("d", "e")
    println(queue.dequeue())
    println(queue)
    println("=======================================")

    //不可变队列
    val queue1: Queue[String] = Queue("1", "2", "3")
    val enqueue: Queue[String] = queue1.enqueue("4")
    println(enqueue)
    println(queue1) //原队列不会改变

  }
}
