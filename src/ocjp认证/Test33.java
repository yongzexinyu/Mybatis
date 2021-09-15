package ocjp认证;

public class Test33 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
       /* new char[5]*/
        String s = "";
        System.out.println(sb+"");
        if (sb.equals(s)) {
            System.out.println("Match 1");
        } else if (sb.toString().equals(s.toString())) {
            System.out.println("sb = " + sb.toString());
            System.out.println("s = " + s);
            System.out.println("Match 2");//String是特殊的类型，支持编译器嵌入常量，而StringBuilder只是一个普通的类，所以不行。
        } else {
            System.out.println("No Match");
        }
    }

}
