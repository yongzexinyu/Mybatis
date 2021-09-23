package ocjp认证;

public class Test69 {
    int sum = 0;
    public void doCheck(int number) {
        if(number%2==0) {
           // break;//if语句不能使用break;
        }else {
            for (int i = 0; i < number; i++) {
                sum += i;
            }
        }
    }
    public static void main(String[] args) {
        Test69 obj = new Test69();
        System.out.println("Red "+obj.sum);
        obj.doCheck(2);
        System.out.println("Orange "+obj.sum);
        obj.doCheck(3);
        System.out.println("Green "+obj.sum);
    }

}
