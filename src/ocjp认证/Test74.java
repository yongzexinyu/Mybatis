package ocjp认证;

import java.util.Arrays;

public class Test74 {
    public static void main(String[] args) {
        String[][] arra = new String[3][];
        arra[0] = new String[]{"rose", "lily"};
        arra[1] = new String[]{"apple", "berry","cherry","grapes"};
        arra[0] = new String[]{"beans", "carrot","potato"};
       // System.out.println("arra[0]. = " + Arrays.toString(arra[0]));
        	for (int i = 0; i < arra.length; i++) {
                 for (int j=0; j < arra[i].length; j++) {
                arra[i][j] = arra[i][j].toUpperCase();
                     System.out.println("arra = " + arra[i][j]);
            }
        }
//不解  打印结果
        /*
        * arra = BEANS
arra = CARROT
arra = POTATO
arra = APPLE
arra = BERRY
arra = CHERRY
arra = GRAPES
Exception in thread "main" java.lang.NullPointerException
	at ocjp认证.Test74.main(Test74.java:13)
*/
    }
}
