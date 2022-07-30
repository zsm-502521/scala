package pattern

/**
 * @author 赵世敏
 * @date 2022/7/29
 *       1208676641@qq.com
 * @description 偏函数
 */
object PartialFunction {
  def main(args: Array[String]): Unit = {
    val list = List(("a", 12), ("b", 13), ("c", 14), ("a", 13))

    //1 map 转换 (k,v*2)
    val tuples: List[(String, Int)] = list.map(tuple => (tuple._1, tuple._2 * 2))
    println(tuples)
    //2 模式匹配对元组进行赋值
    val tuples1: List[(String, Int)] = list.map(
      tuples => {
        tuples match {
          case (k, v) => (k, v * 2)
          case _ => null
        }
      }
    )
    println(tuples1)
    //省略lambda表达式
    val tuples2: List[(String, Int)] = list.map {
      case (k, v) => (k, v * 2)
    }
    println(tuples2)

    // TODO: 偏函数的应用  求绝对值
    //对输入数据分为不同的情形  正 负数  0
    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }
    val negativeAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
    }
    val zeroAbs: PartialFunction[Int, Int] = {
      case 0 => 0
    }

    def abs(x: Int): Int = (positiveAbs orElse negativeAbs orElse zeroAbs) (x)

    println(abs(-10))
    println(abs(0))
    println(abs(123))
  }
}

