package ocjp认证;

import java.util.ArrayList;
import java.util.List;

public class Test47 {
    public static void main(String[] args) {
        double[] a=new double[4];
        a[1]=1;
        a[3]=3;
        for (double s : a) {
            System.out.println("s = " + s);
        }//数组空值在遍历时显示为null
       /* List<String>  a=new ArrayList<>();
        a.add("linux");
        a.add("unix");
        for (String s : a) {
            System.out.println("s = " + s);
        }*/
    }
}
