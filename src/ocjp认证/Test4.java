package ocjp认证;

public class Test4 {



   /* A. final class A1 {
        public A1(){}
    }
    B. public class A2 {
        private static int i;
        private A2(){}
    }
    C. abstract class A3 {
        private static int i;
        public void doStuff(){}
        public A3(){}
    }
    D. class A4 {
        protected static final int i;
        private void doStuff(){}
    }
    E. final abstract class A5 {
        protected static int i;
        void doStuff(){}
        abstract void doIt();
    }*/
    //解析 DE错误
    /*
    *扩展知识点
    * static final 用来修饰方法和变量，由于它有两个修饰符，所以同时具有两种特征

变量 - 表示一旦赋值不可以修改，并且可以用类直接访问 or 调用

方法 - 表示不可覆盖，并且可以通过类直接访问 or 调用
    * */
    /*
    * 1、成员变量：无需初始化。
成员变量无需初始化，系统在创建实例的过程中默认初始化。

补充：以final修饰的成员变量。必须显性的初始化赋值。

2、 方法里面的形参变量： 无需初始化。
Java类方法，属于按值传递机制，调用方法的时候，完成参数的传递，相当形参被初始化。

3、局部变量：必须初始化。
与成员变量不同，局部变量必须显示初始化，才能够使用。

    * */
    // Dfinal修饰的变量没有初始化，E,abstract修饰的类为抽象类，抽象类不能有方法体。

}
