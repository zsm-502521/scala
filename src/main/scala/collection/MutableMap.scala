package collection

import scala.collection.mutable

/**
 * @author 赵世敏
 * @date 2022/7/15
 *       1208676641@qq.com
 * @description 可变map
 */
object MutableMap {
  def main(args: Array[String]): Unit = {
    val map: mutable.Map[String, Int] = mutable.Map(("a" -> 12), ("b" -> 10), ("c" -> 9))
    println(map)
    println(map.getClass)

    //add element
    map.put("d",7)
    map.put("e",5)
    println(map)
    map +=(("f",3),("g",3))
    println(map)

    //delete element
    map.remove("g")
    map -= "f"
    println(map)

    //merge map
    val map1 = Map(("1", 1), ("2", 2))
    map ++= map1
    val map3: mutable.Map[String, Int] = map ++ map1
    println(map)
    println(map3)



  }
}
