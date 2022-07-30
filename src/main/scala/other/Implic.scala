package other

/**
 * @author 赵世敏
 * @date 2022/7/29
 *       1208676641@qq.com
 * @description 隐式转换
 */
object Implic {
  def main(args: Array[String]): Unit = {
    val new12 = new myRichInt(self = 12)
    println(new12.myMax(15))

    // TODO: 隐式函数
    implicit def convert(num: Int): myRichInt = new myRichInt(num)

    println(12.myMax(15))
    println(12.myMin(15))
    println(-12.myMin(-15))

    // TODO: 隐式类
    implicit class myRichInt2(val self: Int) {
      //自定义比较大小的方法
      def myMax2(n: Int): Int = {
        if (n > self) n else self
      }

      def myMin2(n: Int): Int = {
        if (n < self) n else self
      }
    }
    println("=========================")

    // TODO: 隐式参数  按照类型去赋值参数
    implicit val str: String = "biddata"
    implicit val num: Int = 18

    def sayhello()(implicit string: String): Unit = {
      println("hello " + string)
    }

    def sayhi(implicit string: String = "hadoop"): Unit = {
      println("hello " + string)
    }
    def sayAge(implicit string: Int): Unit = {
      println("hello " + string)
    }
    //简便写法
    def simpleInt():Unit={
      println("hello "+implicitly[Int])
    }
    def simpleString():Unit={
      println("hello "+implicitly[String])
    }

    sayhello()
    sayhi() //如果加括号就是默认值  不加就是隐式参数的值
    sayAge
    simpleInt()
    simpleString()
  }
}

class myRichInt(val self: Int) {
  //自定义比较大小的方法
  def myMax(n: Int): Int = {
    if (n > self) n else self
  }

  def myMin(n: Int): Int = {
    if (n < self) n else self
  }
}