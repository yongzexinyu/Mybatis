package ocjp认证;

public class Test23 {
    static int i;
    int j;
    public static void main(String[] args) {
        Test23 x1 = new Test23();
        Test23 x2 = new Test23();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println( // 5 4 5 6
                x1.i + " " +
                        x1.j + " " +
                        x2.i + " " +
                        x2.j);
    }
//解析   静态属性 全局唯一，在一个运行环境中，静态变量只有一个值，任何一次修改都是全局性的影响。
    // 非静态变量赋值不发生冲突
}
