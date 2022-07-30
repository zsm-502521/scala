package pattern

/**
 * @author 赵世敏
 * @date 2022/7/25
 *       1208676641@qq.com
 * @description 模式匹配
 */
object MatchBase {
  def main(args: Array[String]): Unit = {
    var x: Int = 1
    val y: String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case _ => "other"
    }
    println(y)

    // 实例:用模式匹配实现简单二元运算
    val a = 5
    val b = 8

    def matchDualOp(op: Char) = {
      op match {
        case '+' => a + b
        case '-' => a - b
        case '*' => a * b
        case '/' => a / b
        case _ => false
      }
    }

    println(matchDualOp('+'))
    println(matchDualOp('-'))
    println(matchDualOp('*'))
    println(matchDualOp('/'))
    println(matchDualOp('@'))
    println("-------------------------")

    //模式守卫
    //求整数的绝对值
    def abs(sum: Int): Int = {
      sum match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }

    println(abs(-12))
    println(abs(0))
    println(abs(19))

  }
}
