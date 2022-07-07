package function

/**
 * @author 赵世敏
 * @date 2022/7/2
 *       1208676641@qq.com
 * @description 自定义函数实现while
 */
object MyWhile {
  def main(args: Array[String]): Unit = {
    var i = 10
    while (i > 0) {
      println(i)
      i -= 1
    }

    //todo 闭包实现 while  代码块作为参数传递 递归调用
    def myWhile(condition: => Boolean): (=> Unit) => Unit = {
      //条件function
      //内层函数需要递归调用 参数就是循环体
      def doLoop(option: => Unit): Unit = {
        if (condition) {
          option
          myWhile(condition)(option)
        }
      }

      doLoop _
    }

    println(i)
    //i 当前为0 需要重新赋值
    var x = 10
    myWhile(x > 0) {
      println(x)
      x -= 1
    }

    //todo 匿名函数实现
    def myWhile2(condition: => Boolean): (=> Unit) => Unit = {
      opt => {
        if (condition) {
          opt
          myWhile2(condition)(opt)
        }
      }
    }

    var y = 10
    println(y + "*****************************")
    myWhile2(y >= 0) {
      println(y)
      y -= 1
    }

    //todo 柯里化实现
    def mywhile3(codition: => Boolean)(option: => Unit): Unit = {
      if (codition) {
        option
        mywhile3(codition)(option)
      }
    }

    var p = 10
    mywhile3(p >= 0) {
      println(p)
      p -= 1
    }
    println(p+"*****************************")
  }
}
