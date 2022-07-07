/**
 * @author 赵世敏
 * @date 2022/7/2
 * 1208676641@qq.com
 */
public class TestRecursion {
    public static void main(String[] args) {
        //计算阶乘
        System.out.println(factorial(6));
        System.out.println(factorial1(6));
    }
    //循环实现
    public static int factorial(int n){
        int result = 1;
        for (int i=1 ;i<=n ;i++){
            result *= i;
        }
        return result;
    }
    //递归实现
    public static int factorial1(int n){
        //递归结束条件
        if (n==1){
            return 1;
        }
        return n*factorial1(n-1);
    }
}
