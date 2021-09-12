package ocjp认证;

public class Test18 {
    public static void main(String[] args) {
        String[][] chs = new String[2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
//第一行 二个元素   00 97  01 98
        //第二行五个元素
        int i = 97;
        System.out.println("chs.length = " + chs.length);
        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = "" + i;
                System.out.println("i = " + i);
                i++;

                System.out.println("chs = " + chs[a][b]);
            }

        }

    }
}
