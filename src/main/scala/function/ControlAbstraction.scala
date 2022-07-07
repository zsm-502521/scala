package function

/**
 * @author 赵世敏
 * @date 2022/7/2
 *       1208676641@qq.com
 * @description 控制抽象
 */
object ControlAbstraction {
  def main(args: Array[String]): Unit = {
    //todo 传值参数
    def fun1(a: Int): Unit = {
      println(a)
      println(a)
    }

    fun1(1)
    fun1(2)

    def fun2 ():Int={
      println("fun2")
      123
    }
    fun1(fun2())

    //todo 传名参数 传的是代码块
    def fun3(a: => Int): Unit = {
      println("\t"+a)
      println("\t"+a)
    }
    fun3(fun2())
  }
}
