package standard

/**
 * @author 赵世敏
 * @date 2022/7/11
 *       1208676641@qq.com
 * @description 特征的混入
 */
object TraitMixin {
  def main(args: Array[String]): Unit = {
    val stu14 = new Student14()
    stu14.study()
    stu14.dating()
    stu14.increase()
    stu14.increase()
    stu14.increase()
    stu14.increase()

    println("动态混入")

    val stu14withTalent = new Student14 with Talent {
      override def singing(): Unit = println("singing")

      override def dancing(): Unit = println("dancing")
    }
    stu14withTalent.dating()
    stu14withTalent.increase()
    stu14withTalent.singing()
    stu14withTalent.dancing()
    stu14withTalent.increase()

  }
}

trait knowledge {
  var amout: Int = 0

  def increase(): Unit
}

trait Talent {
  def singing(): Unit

  def dancing(): Unit
}

class Person14 {
  val name: String = "zhangsan"
  var age: Int = 18

  def sayHello: Unit = {
    println("hello person " + name)
  }
}

//特质  和抽象类相似  但是特质可以有实现
//trait Young {
//  //抽象和非抽象属性
//  var age: Int
//  val name = "young"
//
//  //抽象和非抽象方法
//  def printInfoYoung(): Unit = {
//    println("Young\t" + name)
//  }
//
//  def dating: Unit
//}

class Student14 extends Person14 with Young with knowledge {
  //重写冲突的属性 name
  override val name: String = "Student"

  //实现抽象方法
  override def dating(): Unit = {
    println("dating\t" + name)
  }

  def study(): Unit = {
    println("study\t" + name)
  }

  //重写父类的方法
  override def sayHello(): Unit = {
    super.sayHello
    println("hello student " + name)
  }

  override def increase(): Unit = {
    amout += 1
    println("increase\t" + name + "\t" + amout)
  }
}