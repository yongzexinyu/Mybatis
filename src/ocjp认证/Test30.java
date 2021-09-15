package ocjp认证;

public class Test30 {
    public static void main(String[] args) {
        String[] strs = new String[2];
        int idx = 0;
        for (String s : strs) {
            strs[idx].concat(" element " + idx);//2、对象为null的情况下去调用该对象所拥有的方法或者成员变量造成的。 空指针异常
            idx++;
        }
        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }


}
