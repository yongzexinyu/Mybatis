package ocjp认证;

public class Test80 {
    static void  test() {
        try {
            Integer x = 1;
            System.out.println(x.toString()+ "");
        } finally {
            System.out.println("finally");
        }
    }
    public static void main(String[] args) {
        try{
            test();
        }catch (Exception ex){
            System.out.println("exection");
        }
    }
}
