/**
 * @author 赵世敏
 * @date 2022/5/28
 * 1208676641@qq.com
 */

import java.io.IOException;
import java.util.Date;

/**
 * 精度自动向上转换
 * 定义 byte类型 没有 byte 方法的话 自动掉用short 方法
 */
public class test {

    public static void main(String[] args) {
//        String s = new String("10");
        byte s = 1;
        test01(s);

    }

    //重载方法
    public static void test01(byte b) {
        System.out.println("bbbb");
    }

    public static void test01(int b) {
        System.out.println("int");
    }

    public static void test01(char b) {
        System.out.println("long");
    }

    public static void test01(short b) {
        System.out.println("short");
    }

    public static void test01(String as) {
        System.out.println("string");
    }
    //获取当前时间
    public static void test02(){
        Date date = new Date();
        System.out.println(date);
    }
    //pdf格式转换成html
    public static void test03() throws IOException {
        String pdf = "C:\\Users\\Administrator\\Desktop\\test.pdf";
        String html = "C:\\Users\\Administrator\\Desktop\\test.html";
        String cmd = "cmd /c start C:\\Users\\Administrator\\Desktop\\test.html";
        String cmd1 = "cmd /c start C:\\Users\\Administrator\\Desktop\\test.pdf";
        Runtime.getRuntime().exec(cmd);
        Runtime.getRuntime().exec(cmd1);
    }

}
