package ocjp认证;

public class Test64 {
    public static void main(String[] args) {
        int aVar=9;
        System.out.println("aVar = " + ++aVar);
        if(aVar++ < 10) {
            System.out.println("aVar = " + aVar);
            System.out.println(aVar + " Hello World!");
        }else {
            System.out.println(aVar + " Hello Universe!");
        }

    }
}
