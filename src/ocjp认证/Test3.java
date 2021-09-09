package ocjp认证;

public class Test3 {
/*
* 结果是什么？
A. true true
B. true false
C. false true
D. false false
E. 编译失败。
*/
//考点 static静态修饰符
        public static void main(String[] args) {
            Test3 ts = new Test3();
            System.out.print(isAvailable + " ");
            isAvailable= ts.doStuff();
            System.out.println(isAvailable);
        }
        public static boolean doStuff() {
            return !isAvailable;
        }
        static boolean isAvailable = false;
    }
 //   解析：答案选C  扩展： 在java的基本数据类型中 boolean类型不能和其他类型的值做转换
//，静态变量指的是被static修饰的类的变量；静态变量被所有类实例对象所共享，在内存中只有一个副本，当且仅当在类初次加载时会被初始化
//静态方法也属于类,不属于实例的。静态方法只能访问类的静态变量...




