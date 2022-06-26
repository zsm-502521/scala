package function

/**
 * @author 赵世敏
 * @date 2022/6/25
 *       1208676641@qq.com
 *
 */
object FunctionPractice {
  def main(args: Array[String]): Unit = {
    val fun = (i: Int, string: String, char: Char) => {
      if (i == 0 && string == ""&& char=='0')
        false else true
    }
    println(fun(0, "", '0'))
    println(fun(1, "", '0'))
    println(fun(1, "", '0'))
    println(fun(0, "hello", '0'))
  }
}
