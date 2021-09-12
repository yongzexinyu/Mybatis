package ocjp认证;

public class Test24 {
    int count;
    public static void displayMsg() {
        //count++;                                                // line n1
        //System.out.println("Welcome "+"Visit Count: "+count);   // line n2
    }
    public static void main(String[] args) {
        Test24.displayMsg();                                       // line n3
        Test24.displayMsg();                                       // line n4
    }
//line1 和  line2 编译失败  在静态方法中，不能引用成员变量（即，没有static修饰的变量）。

}
