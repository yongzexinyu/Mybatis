package ocjp认证;

public class Test43 {
    public static void main(String[] args) {
        String product = "Pen";
        product.toLowerCase();
        String concat = product.concat(" B".toLowerCase());
        System.out.println("concat = " + concat);
        System.out.println(concat.substring(2,5));
        System.out.println(concat.substring(0));
        System.out.println("concat = " + concat.indexOf(" "));

    }

}
