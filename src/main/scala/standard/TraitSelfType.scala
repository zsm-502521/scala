package standard

/**
 * @author 赵世敏
 * @date 2022/7/12
 *       1208676641@qq.com
 * @description
 */
object TraitSelfType {
  def main(args: Array[String]): Unit = {
    new RegisterUser("alice", 123456).insert()
  }
}

class User(val name: String, val password: Int)

trait userDao {
  //自身类型为user
  _: User =>
  //向数据库插入数据
  def insert(): Unit = {
    println("insert into db:" + this.name + "," + password)
  }
}

class RegisterUser(name: String, password: Int) extends User(name, password) with userDao {

}