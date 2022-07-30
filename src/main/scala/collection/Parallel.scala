package collection

import scala.collection.immutable
import scala.collection.parallel.immutable.ParSeq

/**
 * @author 赵世敏
 * @date 2022/7/25
 *       1208676641@qq.com
 * @description  并行计算
 */
object Parallel {
  def main(args: Array[String]): Unit = {
    //串行集合运算
    val result: immutable.IndexedSeq[String] = (1 to 100).map(
      a => Thread.currentThread.getName
    )
    println(result)
    //并行集合运算
    val result2: ParSeq[String] = (1 to 100).par.map(
      a => Thread.currentThread.getName
    )
    println(result2)

    val result2toInt: ParSeq[Long] = (1 to 100).par.map(
      a => Thread.currentThread.getId
    )
    println(result2toInt)
  }
}
