package pattern

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY

/**
 * @author 赵世敏
 * @date 2022/7/25
 *       1208676641@qq.com
 * @description 匹配类型
 */
object MatchTypes {
  def main(args: Array[String]): Unit = {
    //todo 匹配常量
    def describeCons(s: Any): String = {
      s match {
        case 1 => "Int"
        case "hello" => "String"
        case true => "Boolean"
        case '+' => "char"
        case _ => " "
      }
    }

    println(describeCons("hello"))
    println(describeCons(2))
    println(describeCons('+'))
    println(describeCons(0.3))
    println("=============================")


    // TODO: 匹配类型
    def describeType(a: Any): Any = {
      a match {
        case i: Int => "Int " + i
        case i: String => "String " + i
        case i: List[String] => "List[String] " + i
        case i: Array[Int] => "Array[Int] " + i.mkString("-")
        case _ => "Something else"
      }
    }

    println(describeType(12))
    println(describeType("hello "))
    println(describeType(List(1, 2, 3, 4, 5)))
    println(describeType(Array(1, 2, 3, 4, 5)))
    println(describeType(0.2))
    println("===================================")

    // TODO: 匹配数组
    for (arr <- List(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(2, 3, 7, 15),
      Array("hello", 20, 30)
    )) {
      val result = arr match {
        case Array(0) => "0"
        case Array(1, 0) => "Array(1,0)"
        case Array(x, y) => "Array: " + x + "," + y //匹配两元素的数组
        case Array(0, _*) => "以0为开头的数组"
        case Array(x, 1, y) => "中间为0的三元素数组"
        case Array(x, z, y) => "三元素数组"
        case _ => "other"
      }
      println(result)
    }
    println("============================")
    // TODO: 匹配列表
    for (list <- List(
      List(0),
      List(1, 0),
      List(0, 1, 0),
      List(1, 1, 0),
      List(2, 3, 7, 15),
      List("hello", 20, 30)
    )) {
      val result = list match {
        case 0 :: Nil => "0"
        case 1 :: 0 :: Nil => "1,0"
        case x :: y :: Nil => "x,y"
        case 0 :: tail => "0..."
        case _ => "other"
      }
      println(result)
    }
    println("============================")
    //方式二
    val  list = List(1, 2, 3, 4, 5)

    list match {
      case first::second::tail => println(first + "," + second + "," + tail)
      case _ => println("other")
    }

    println("============================")
    //匹配元组
    for (tuple <-List(
      (0,1),
      (1,0),
      (0,1,0),
      (1,1,0),
      (2,3,7,15),
      ("hello",20,30)
    )){
      val result = tuple match {
        case (0,_) => "0..."
        case (y,0) => "y,0"
        case (x,y) => "x,y"
        case _ => "other"
      }
      println(result)
    }
  }
}
