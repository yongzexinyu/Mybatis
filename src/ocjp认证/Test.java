package ocjp认证;

public class Test {
    /*
    * 结果是什么？
A. myStr: 9009, myNum: 9009
B. myStr: 7007, myNum: 7007
C. myStr: 7007, myNum: 9009
D. 编译失败。
*/
/*考点：全局变量和局部变量*/
        String myStr = "7007";//全局变量

        public void doStuff(String str) {
            int myNum = 0;//局部变量
            try {
                String myStr = str;
                myNum = Integer.parseInt(myStr);
            } catch (NumberFormatException ne) {
                System.err.println("Error");
            }
            System.out.println(
                    "myStr: " + myStr + ", myNum: " + myNum);
        }

        public static void main(String[] args) {
            Test obj = new Test();
            obj.doStuff("9009");
            /*
            * 答案选C. myStr: 7007, myNum: 9009
            * 解析因为 myNum是在方法体内定义的所以为局部变量，只在方法体内有效，
            * myStr在方法体外为全局变量，整个程序都有效
            *
            * */
        }
    }
