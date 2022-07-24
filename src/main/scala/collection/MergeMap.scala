package collection

import scala.collection.mutable

/**
 * @author 赵世敏
 * @date 2022/7/24
 *       1208676641@qq.com
 * @description 规约
 */
object MergeMap {
  def main(args: Array[String]): Unit = {
    val map = Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map1 = mutable.Map("a" -> 1, "b" -> 4, "c" -> 6)
    println(map ++ map1)
    println(map1 ++ map)

    val map3: mutable.Map[String, Int] = map.foldLeft(map1)(
      (mergeMap, kv) => {
        val key = kv._1
        val value = kv._2
        mergeMap(key) = mergeMap.getOrElse(key, 0) + value
        mergeMap
      }
    )
    println(map3)
  }
}
