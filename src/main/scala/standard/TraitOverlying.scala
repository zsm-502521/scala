package standard

/**
 * @author 赵世敏
 * @date 2022/7/12
 *       1208676641@qq.com
 * @description 特性叠加
 */
object TraitOverlying {
  def main(args: Array[String]): Unit = {
    //普通叠加 按照从右到左的顺序叠加
    new Student15().increase()
    //钻石叠加 父类特性在最后 子类特性在前面
    val football = new MyFootball()
    println(football.describe())
  }
}

trait knowledge15 {
  var amout: Int = 0

  def increase(): Unit = {
    println("knowledge increase")
  }
}

trait Ball {
  def describe(): String = {
    "ball"
  }
}

//颜色
trait ColorBall extends Ball {
  var color: String = "red"

  override def describe(): String = {
    color + "-" + super.describe()
  }
}

//种类
trait CategoryBall extends Ball {
  var category: String = "foot"

  override def describe(): String = {
    category + "-" + super.describe()
  }
}

//自定义类
class MyFootball extends CategoryBall with ColorBall {
  override def describe(): String = {
    "myball is " + super.describe()
  }
}

trait Talent15 {
  def singing(): Unit

  def dancing(): Unit

  def increase(): Unit = {
    println("talent increase")
  }
}

//特性叠加  如果有相同的方法，从右到左执行
class Student15 extends Person13 with knowledge15 with Talent15 {
  override def singing(): Unit = println("singing")

  override def dancing(): Unit = println("dancing")

  override def increase(): Unit = {
    super.increase()
  }
}