package pattern

/**
 * @author 赵世敏
 * @date 2022/7/27
 *       1208676641@qq.com
 * @description  匹配元组扩展
 */
object MatchTuple {
  def main(args: Array[String]): Unit = {
    //1 在变量声明时匹配
    val (x, y) = (1, 2)
    println(x+"  "+y)

    val List(f,s,_*) = List("a","b","c","d")
    println(f+"  "+s+"  ")

    //rest 可以表示剩余的元素
    val first :: second :: rest=List("a","b","c","d")
    println(first+"  "+second+"  "+rest)
    println("==========================")
    //2 在for推导式中模式匹配
    val lst:List[(String,Int)] = List(("a",12),("b",13),("c",14),("a",123))
    for(lst<- lst){
      println(lst._1+"  "+lst._2)
    }
    //将list元素直接定义为元组
    for(
      (k,v)<-lst
    ){
      println(k+" : "+v)
    }
    //只遍历k 或者v
    for(
      (k,_ )<-lst
    ){
      println(k)
    }
    //只遍历k为a的元素
    for (
      ("a",a)<-lst
    ){
      println(a)
    }

  }
}
