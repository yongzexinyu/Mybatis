package ocjp认证;

public class Test54 {
    static void doubling (Integer ref, int pv) {
        ref =20;
        pv = 20;
    }
    public static void main(String[] args) {
        Integer iObj = new Integer(10);
        int iVar = 10;
        doubling(iObj++, iVar++);

        System.out.println(iObj+ ", "+iVar);
    }

}
