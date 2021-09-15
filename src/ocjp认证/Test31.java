package ocjp认证;

public class Test31 {
    public static void main(String[] args) {
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2;          //line n1
       // String s4 = (String) (s3 * s2);    //line n2 Error:(8, 30) java: 不兼容的类型: long无法转换为java.lang.String
        String s4=String.valueOf(s3*s2);
        System.out.println("Sum is " + s4);
    }

}
