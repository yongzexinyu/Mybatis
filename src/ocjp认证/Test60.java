package ocjp认证;

public class Test60 {
    public static String doMsg(char x) {
        return "Good Day!";
    }
    public static String doMsg(int y) {
        return "Good Luck!";
    }
    public static void main(String[] args) {
        char x = 8;
        int z = '8';
        System.out.println("x = " + x);
        System.out.println("z = " + z);
        System.out.println(doMsg(x));
        System.out.println(doMsg(z));
    }



}
