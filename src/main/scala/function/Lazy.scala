package function

/**
 * @author 赵世敏
 * @date 2022/7/4
 *       1208676641@qq.com
 * @description 惰性加载
 */
object Lazy {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(10, 20)
    println("1 函数调用")
    println("2 "+result)
    println("4 "+result)

  }
  def sum(a: Int, b: Int): Int = {
    println("3 函数调用")
    a + b
  }

}
