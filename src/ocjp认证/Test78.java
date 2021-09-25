package ocjp认证;

public class Test78 {
    public static void main(String[] args) {
        int[]x={1,2,3};
        int[]y={4,5,6};
        new Test78().go(x,y);
    }
    void go(int[]...z){ //代表可变参数
        for(int[]a:z)
            System.out.println(a[0]);

    }
}
