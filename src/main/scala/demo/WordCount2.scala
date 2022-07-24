package demo

/**
 * @author 赵世敏
 * @date 2022/7/24
 *       1208676641@qq.com
 * @description wc complex 案例
 */
object WordCount2 {
  def main(args: Array[String]): Unit = {
    val stringList: List[(String, Int)] = List(
      ("hello", 1),
      ("hello world", 2),
      ("hello scala", 3),
      ("hello spark from scala", 1),
      ("hello flink from scala", 1)
    )
    //todo  将list 转化为普通版本
    val strings: List[String] = stringList.map(
      (kv) => {
        (kv._1.trim + " ") * kv._2
      }
    )
    val strings1: List[String] = strings.flatMap(_.split(" "))
    val groupMap: Map[String, List[String]] = strings1.groupBy(word => word)
    println(groupMap)
    val countMap: Map[String, Int] = groupMap.map(kv => (kv._1, kv._2.length))
    println(countMap)
    val list: List[(String, Int)] = countMap.toList
    println(list)
    val sortList: List[(String, Int)] = list.sortWith(_._2 > _._2)
    println(sortList)
    println(sortList.take(3))

    println("======================================")
    //todo 直接基于预统计的结果进行转换
    // 字符串打散 包装成单词
    val tuples: List[(String, Int)] = stringList.flatMap(
      tuple => {
        val string: Array[String] = tuple._1.split(" ")
        string.map(word => (word, tuple._2))
      }
    )
    println(tuples)
    val stringToTuples: Map[String, List[(String, Int)]] = tuples.groupBy(kv => kv._1)
    println(stringToTuples)
    //叠加每个单词预统计的数值  mapValues  只操作 values值不对key做改变
    val stringToInt: Map[String, Int] = stringToTuples.mapValues(
      kv => kv.map(_._2).sum
    )
    println(stringToInt)
    val tuples1: List[(String, Int)] = stringToInt
      .toList
      .sortWith(_._2 > _._2)
      .take(3)
    println(tuples1)


  }
}
