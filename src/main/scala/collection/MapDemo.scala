package collection

/**
 * @author 赵世敏
 * @date 2022/7/15
 *       1208676641@qq.com
 * @description 不可变map 键值对
 */
object MapDemo {
  def main(args: Array[String]): Unit = {
    //establish
    val map: Map[String, Int] = Map(("a" -> 12), ("b" -> 10), ("c" -> 9))
    println(map)
    println(map.getClass)
    //2 遍历元素
    map.foreach(println)
    map.foreach((kv: (String, Int)) => println(kv))
    //3 访问特定元素
    for (i <- map.keys) {
      println(s"$i ----> ${map.get(i)}")
    }
    println(map.keys)
    println(map.get("a").get)
    println(map.get("q"))
    println(map.getOrElse("aa", ",,,"))
  }
}
