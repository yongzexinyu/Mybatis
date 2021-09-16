package ocjp认证;

public class Test50 {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta =ta.concat(tb);
        ta.replace('C','D');//解析 需要重新接收结果
        ta =ta.concat(tb);
        System.out.println(ta);
    }

}
