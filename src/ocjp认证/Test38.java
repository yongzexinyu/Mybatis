package ocjp认证;

import java.util.ArrayList;
import java.util.List;

public class Test38 {
    public static void main(String[] args) {

         List colors = new ArrayList();
         colors.add("green");
         colors.add("red");
         colors.add("blue");
         colors.add("yellow");
         colors.add(null);
         colors.remove(null);
         colors.remove(2);
        System.out.println("colors = " + colors);
         colors.add(3, "cyan");
         System.out.print(colors);

    }
}
