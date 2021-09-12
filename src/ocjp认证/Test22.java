package ocjp认证;

public class Test22 {
    public static void main(int[] args) {
        System.out.println("int main " + args[0]);
    }
    public static void main(Object[] args) {
        System.out.println("Object main " + args[0]);
    }
    public static void main(String[] args) {
        System.out.println("String main " + args[0]);
    }

//解析 String[] args 是被系统识别主方法，如果我们不这样做，系统就找不到主方法。当然args只是普通变量名，可以随便定义。
   /* 若一个程序有几个main方法，除了主方法外，其他的main方法皆是重载。*/

}
