package other

/**
 * @author 赵世敏
 * @date 2022/7/30
 *       1208676641@qq.com
 * @description 泛型
 */
object Generics {
  def main(args: Array[String]): Unit = {
    // TODO: 协变和逆变
    val child: Parent = new Child
    val childList: MyCollection[Child] = new MyCollection[Parent] //逆变
    val childList1: MyCollection1[Parent] = new MyCollection1[Child] //协变
    val childList2: MyCollection[Child] = new MyCollection[Parent] //不变

    // TODO: 上下限
    //参数只能是 Child 的子类
    def test[A <: Child](a: A): Unit = {
      println(a.getClass.getName)
    }
    test[Child](new SubChild)
    test[SubChild](new SubChild)
  }
}

//定义继承关系
class Parent {}

class Child extends Parent {}

class SubChild extends Child {}

//定义带泛型的集合类型
class MyCollection[-E] {}

class MyCollection1[+E] {}

class MyCollection2[E] {}

