import standard.Stu;

/**
 * @author 赵世敏
 * @date 2022/7/8
 * 1208676641@qq.com
 * @description  java 中的动态绑定
 */
public class DynamicBind {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        student.hello();
        student.hi();
        System.out.println("***********");
        //动态绑定
        Person person = new Student();
        System.out.println(person.name);  //属性是静态绑定的
        person.hello();  //方法是动态绑定的
//        person.hi();  error
    }
}
class Person {
    String name = "person";
    public  void hello() {
        System.out.println("hello Person");
    }
}
class Student extends Person {
    String name = "student";
    public void hello() {
        System.out.println("hello Student");
    }
    public void hi(){
        System.out.println("hi Student");
    }
}