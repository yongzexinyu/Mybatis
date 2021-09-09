package ocjp认证;

public class Test2 {
/*
* 结果是什么？
A. Answer = 0
B. Invalid calculation
C. 编译仅在 line n1 处失败。
D. 编译仅在 line n2 处失败。
E. 编译在 line n1 和 line n2 处失败。
*/

//考点：变量的作用域  类级、对象实例级、方法级、块级
    public static void main(String[] args) {
        int num=0;
        int div=0;
        int ans=0;
        try {
             num = 10;
             div = 0;
             ans = num / div;
        } catch (ArithmeticException ae) {
            ans = 0;                             // line n1
        } catch (Exception e) {
            System.out.println("Invalid calculation");
        }
        System.out.println("Answer = " + ans);   // line n2
    }
/*
* 答案选 E 编译在 line n1 和 line n2 处失败。
* 解析 1.0不能做除数 ，2.因为变量定义在了try{}里面，所以他是一个块级的局部变量，离开这个块就会失效，所以 在try{}外面不能直接赋值 和打印
* 可以将变量在外面做一下初始化，这样作用域就变成了方法级的，在整个main方法 中都可以使用
*
* */
}
