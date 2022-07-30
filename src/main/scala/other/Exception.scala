package other

/**
 * @author 赵世敏
 * @date 2022/7/29
 *       1208676641@qq.com
 * @description 异常
 */
object Exception {
  def main(args: Array[String]): Unit = {
    try {
      val n = 10 / 0
    } catch {
      case e:ArithmeticException=> println("arithmeticException")
      case e:Exception=> println("exception")
    } finally {
      println("结束")
    }
  }
}
