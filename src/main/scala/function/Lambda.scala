package function

/**
 * @author 赵世敏
 * @date 2022/6/15
 * 1208676641@qq.com
 */

/**
 * 高阶函数  函数至简原则
 */
object Lambda {
  def main(args: Array[String]): Unit = {
    def function1(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }

    val add = (x: Int, y: Int) => x + y
    val minus = (a: Int, b: Int) => a - b
    println(function1(add))
    println(function1(minus))
    //简化 对应的类型可以省略
    println(function1((x: Int, y: Int) => x + y))
    println(function1((_ + _))) //参数对应的顺序一致

    //高阶函数
    def f(i: Int): Int = {
      println("f函数被调用")
      i + 1
    }

    val resule: Int = f(12)
    println(resule)
    //分割线
    study.separate.sepatator("---------------------")
    // TODO: 1 函数作为值进行传递
    val f1 = f(_) //val f1 = f _
    println(f1(12))
    println(f1)
    //分割线
    study.separate.sepatator("---------------------")

    //todo: 2 函数作为参数传递
    def dualeVal(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def opadd(a: Int, b: Int): Int = {
      a + b
    }
    println(dualeVal(opadd, 12, 123))
    println(dualeVal(_ + _, 121, 2))
    //分割线
    study.separate.sepatator("---------------------")
    // todo 3 函数作为函数的返回值
    def f2():String =>Unit ={
      def f3(s:String):Unit={
        println("f3函数被调用\t"+s)
      }
      f3 //f3 作为f2的返回值
    }
    println(f2 _)
    println(f2()("hello"))
    println("*************************")
    //下面三行是一个整体
    val f3 = f2()
    println(f3("Nihao"))
    println(f2)
  }

}
