package ocjp认证;

public class Test10 {

        String name;
        boolean contract;
        double salary;
    Test10() {
            // line n1

        }
        public String toString(){
            return name + ":" + contract + ":" + salary;
        }
        public static void main(String[] args) {
            Test10 e = new Test10();
            // line n2
            System.out.print(e);
            System.out.println((int)Math.random()*1000);
        }
/*
* 解析;
* 首先，static叫静态方法，也叫类方法，它先于任何的对象出现。在程序最开始启动（JVM初始化）的时候，就会为static方法分配一块内存空间，成为静态区，属于这个类。而非static方法，必须在类实例化的时候，才会给分配内存空间，在实例化对象的时候JVM在堆区分配一个具体的对象，this指针指向这个对象。也就是说，this指针是指向堆区中的类的对象，而static域不属于this指向的范围所在，所以不能调用。

同时，在static修饰的方法中，不能使用super()，道理其实与上面差不多。

super代表子类对父类满参构造函数的初始化，也是需要产生对象才可以使用但是考虑到虚拟机加载顺序为先加载类，当被实例化才产生对象。所以如果并存则表示类和对象同时加载，显然是不合逻辑的。
*/
}
