package function

/**
 * @author 赵世敏
 * @date 2022/7/2
 *       1208676641@qq.com
 *
 */
object TestRecursion {
  def main(args: Array[String]): Unit = {
    println(factorial(5))
    println(tailFact(5))
  }

  //递归实现阶乘
  def factorial(n: Int): Int = {
    if (n == 1) return 1
    factorial(n - 1) * n
  }
  //尾递归实现
  def tailFact(n:Int):Int={
    @annotation.tailrec
    def loop(n:Int,recursionResult:Int):Int={
      if(n==1) recursionResult
      else loop(n-1,n*recursionResult)
    }
    loop(n,1)
  }

}
