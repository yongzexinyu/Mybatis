package ocjp认证;

public class Test46 {public static void main(String[] args) {
    int row = 10;
    for (; row > 0;) {
        int col = row;
        while (col >= 0) {
            System.out.println(col + "");
            col -= 2;
        }
        System.out.println("row = " + row);
        System.out.println("col = " + col);
        row = row / col;
        System.out.println("col = " + row);
        System.out.println(-2/10);
        System.out.println(10/-2);
    }
}


}
