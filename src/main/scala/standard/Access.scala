package standard

/**
 * @author 赵世敏
 * @date 2022/7/5
 *       1208676641@qq.com
 * @description
 */
object Access {
  def main(args: Array[String]): Unit = {
    //定义对象
    val person:Person = new Person()
    //调用方法
    println(person.age)
    person.printForPerson()
    println("***************")
    //定义对象
    val worker = new Worker()
//    println(worker.name)
    worker.age = 20
    worker.printForPerson()
  }

}
class Worker extends Person{
  override def printForPerson (): Unit ={
    println("worker")
    name="worker"
    age=18
    sex= "女"
    println(s"worker: ${name}\t${sex}\t${age}")


  }
}
