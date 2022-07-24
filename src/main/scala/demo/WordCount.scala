package demo

/**
 * @author 赵世敏
 * @date 2022/7/24
 *       1208676641@qq.com
 * @description wc simpleness 案例
 */
object WordCount {
  def main(args: Array[String]): Unit = {
    val stringList = List(
      "hello",
      "hello world",
      "hello scala",
      "hello spark from scala",
      "hello flink from scala"
    )
    // 对字符串进行切分 得到一个打散所有单例的list   =》 flaMap
    val stringList1: List[Array[String]] = stringList.map(_.split(" "))
    val flatten: List[String] = stringList1.flatten //打散
    val groupMap: Map[String, List[String]] = flatten.groupBy(word => word)
    println(groupMap)
    // 对分组之后的list取长度 得到每个单词个数
    val CountMap: Map[String, Int] = groupMap.map((kv) => {
      (kv._1, kv._2.length)
    })
    println(CountMap)
    //  排序 map没有sort方法  需要转成list  排序取前三
    val mapList: List[(String, Int)] = CountMap.toList  //转list
    println(mapList)
    val tuples: List[(String, Int)] = mapList.sortWith(_._2 > _._2)  //排序
    println(tuples)
    val takeTuples: List[(String, Int)] = tuples.take(3)  //取前三
    println(takeTuples)
  }
}
