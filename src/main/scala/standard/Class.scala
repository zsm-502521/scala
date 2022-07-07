package standard

import scala.beans.BeanProperty

/**
 * @author 赵世敏
 * @date 2022/7/4
 *       1208676641@qq.com
 * @description
 */
object Class {
  def main(args: Array[String]): Unit = {
    var student1 = new student()
    student1.age = 18
    student1.setAge(102)
    println(student1.age)
  }

}

class student {
  //私有属性
  private var name: String = _
  //提供getter和setter方法
  @BeanProperty
  var age: Int = _
  var sex: String = "man"
}
