package ocjp认证;

public class Test8 {

    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        System.out.println(x++);
        System.out.println(++y);
        System.out.print("Log " + x + ":" + y);
        if(x++ > ++y){
            System.out.print("Hello ");
        } else {
            System.out.print("Welcome ");
        }
        System.out.print("Log " + x + ":" + y);
        System.out.println(1+1+1);

        System.out.println("b"+(1)+(1));
    }

}
