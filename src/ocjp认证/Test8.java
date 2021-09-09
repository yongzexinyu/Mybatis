package ocjp认证;

public class Test8 {

    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        if(x++ > ++y){
            System.out.print("Hello ");
        } else {
            System.out.print("Welcome ");
        }
        System.out.print("Log " + x + ":" + y);
    }

}
