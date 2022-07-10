package standard

/**
 * @author 赵世敏
 * @date 2022/7/8
 *       1208676641@qq.com
 * @description  多态：scala中的动态绑定
 */
object DynamBind {
  def main(args: Array[String]): Unit = {
    val stu11:Stu11 = new Stu11
    println(stu11.name)  //属性是动态绑定的，可以调用任意方法
    stu11.printName()  //方法是动态绑定的，可以调用任意属性

  }

}
class Person3{
 val name :String="person"
  def printName(){
    println("hello  "+name)
  }
}
class Stu11 extends Person3{
  override val name:String = "Student"
  override def printName(){
    println("hello  " +name)
  }
}