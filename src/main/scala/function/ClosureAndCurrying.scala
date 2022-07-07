package function

/**
 * @author 赵世敏
 * @date 2022/6/30
 *       1208676641@qq.com
 * @description 闭包和柯里化
 */
object ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def add(x: Int, y: Int) = {
      x + y
    }

    // 1. 考虑固定一个加数
    def addByFour(a: Int): Int = {
      a + 4
    }

    // 2. 考虑固定加数改变
    def addByFive(a: Int): Int = {
      a + 5
    }

    // 3. 将固定加数作为一个参数传入 但是是作为‘第一层参数’传入
    def addByFour1(): Int => Int = {
      val a = 4

      def addB(b: Int): Int = {
        a + b
      }

      addB
    }

    def addByA(a: Int): Int => Int = {
      val a = 4
      (b: Int) => a + b
    }

    println(addByA(4)(5))
    println(addByFour1()(6))

    //柯里化
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }

    println(addCurrying(1)(2))
  }
}
