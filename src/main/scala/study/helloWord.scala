package study

/**
 * @author 赵世敏
 * @date 2022/5/27
 *       1208676641@qq.com
 *
 */
/**
 * 文档注释
 * object 生成一个单例对象
 * def 方法名称
 * main 方法
 * args String类型的array 数组
 * unit 返回值为空
 */
object helloWord {
  def main(args: Array[String]): Unit = {
    //常量 val 变量 var  能用常量不用变量
    val a = 10
    val b = 20
    val c:Int = 12
    val res: Unit = println(a + b)
    println("hello word")
    System.out.println("scala")
  }

}
