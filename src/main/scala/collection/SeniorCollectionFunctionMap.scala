package collection

/**
 * @author 赵世敏
 * @date 2022/7/23
 *       1208676641@qq.com
 * @description 高级函数  map类
 */
object SeniorCollectionFunctionMap {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    //todo 过滤
    //选取偶数
    println(list.filter((a: Int) => {
      a % 2 == 0
    }))
    println(list.filter(_ % 2 == 1)) //奇数
    //todo map
    //集合数字 * 2
    println(list.map(_ * 2)) //乘2
    println(list.map(x => x * x)) //平方
    //todo 扁平化
    val list1: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9), List(10))
    println(list1(3))
    val list2 = list1(0) ::: list1(1) ::: list1(2) ::: list1(3)
    println(list2)
    println(list1.flatten)
    //todo 扁平化+映射
    val strings: List[String] = List("hello java", "hello hive", "hello scala", "hello spark")
    val stringsMap: List[Array[String]] = strings.map(a => a.split(" ")) //map拆分
    println(stringsMap.flatten)
    println(strings.flatMap(_.split(" "))) //简化 扁平映射
    //todo 分组 proupBy
    //奇偶数分组
    println(list.groupBy( (a: Int) => {
      a % 2 == 1
    }))
    println(list.groupBy(_ % 2))
    println(list.groupBy((elem: Int) => {
      if (elem % 2 == 0) "偶数" else "奇数"
    }))
    //按照单词首字母分组
    val wordList=List("china","americe","alice","bob","cary")
    println(wordList.groupBy(_.charAt(0)))
  }
}
