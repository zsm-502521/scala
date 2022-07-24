package collection

/**
 * @author 赵世敏
 * @date 2022/7/20
 *       1208676641@qq.com
 * @description collection option
 */
object Option {
  def main(args: Array[String]): Unit = {
    val list =List(1,23,4,5,6,55,7)
    val set =Set(1,2,4,5,6,7)
    //    （1）获取集合长度
    println(list.length)
    println(list.size)
    //    （2）获取集合大小
    println(set.size)
    //    （3）循环遍历
    for (elem <- list) {print(elem)}
    println("-----------")
    list.foreach(print)
    println("==========")
    //    （4）迭代器
    for(elem<-list.iterator){print(elem)}
    //    （5）生成字符串
    println(list)
    println(set)
    println(list.mkString("-"))
    //    （6）是否包含
    println(list.contains(1))
    println(set.contains(8))
  }
}
