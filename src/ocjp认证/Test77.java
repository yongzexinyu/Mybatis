package ocjp认证;

import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Test77 {
    public static void main(String[] args)
    {
        int[][] a=new int[2][1];
        a[0]=new int[1];
        a[1]=new int[3];
        a[0][1]=1;
        System.out.println(a[0][1]);
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.println("anInt = " + anInt);
            }
        }
    
    }
 
}
