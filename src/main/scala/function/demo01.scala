package function

/**
 * @author 赵世敏
 * @date 2022/6/5
 *       1208676641@qq.com
 * @description 函数式编程
 * @version 1.0
 */
object demo01 {
  def main(args: Array[String]): Unit = {
    //定义一个函数
    def test(i: Int): Int = {
      i + 1
    }
    //调用函数
    println(test(10))
    println(test(20))
    println(function.demo01.test("Bob"))
  }

  //定义对象的方法
  def test(name: String): String = {
    println(name)
    "hello" + name
  }
}

/**
 * 参数 和 返回值
 */
object deme02 {
  def main(args: Array[String]): Unit = {
    //有参数，有返回值
    def test(i: Int): Int = {
      i + 1
    }

    //无参数，有返回值
    def test2(): Int = {
      10
    }

    //有参数，无返回值
    def test3(i: Int): Unit = {
      println(i)
    }

    //无参数，无返回值
    def test4(): Unit = {
      println("hello")
    }

    //多个参数，有返回值
    def test5(i: Int, j: Int): Int = {
      i + j
    }

    //多个参数，无返回值
    def test6(i: Int, j: Int): Unit = {
      println(i + j)
    }

    test(10)
    println(test2())
  }
}

object demo02 {
  //定义一个函数
  def main(args: Array[String]): Unit = {
    //可变参数
    def f1(str: String*): Unit = {
      println(str)
    }

    f1("a", "b", "c")
    f1("a", "b", "c", "d")

    //多个参数  可变参数在最后
    def f2(i: Int, str: String*): Unit = {
      println(i + "  " + str)
    }

    f2(1, "a", "b", "c")

    //参数默认值
    def f3(i: String = "hello", str: String): Unit = {
      println(i + " " + str)
    }

    f3(str = "world")

    //带名参数
    def f4(i: Int, j: Int, str: String): Unit = {
      println(i + " " + j + " " + str)
    }

    f4(str = "world", i = 0, j = 2)

  }
}

/**
 * 匿名函数的简化
 */
object demo03 {
  def main(args: Array[String]): Unit = {
    //正常函数
    def f1(name: String): Unit = {
      println(name)
    }

    f1("zhangsan")

    //分割线
    study.separate.sepatator("--")
    //匿名函数 lambda 表达式
    val fun: Int => Unit = (ages: Int) => {
      println(ages)
    }
    fun(10)
    //fengehuan
    study.separate.sepatator("--")

    //定义一个函数 以函数作为参数
    def f2(func: Int => Unit): Unit = {
      func(120)
    }

    f2(fun)
    val functions: (Int, String) => Unit = (ages: Int, adrss: String) => {
      println(ages+" "+adrss)
    }
  }
}