package ocjp认证;

public class Test58 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder ( ) ;
        sb.append ("world");
        	sb.insert(0,"Hello ");
      /*  System.out.println(sb);
        	sb.append(0,"Hello ");
        System.out.println(sb);
         	sb.add(0,"Hello ");
        System.out.println(sb);
         	sb.set(0,"Hello ");
        System.out.println(sb);*/
//解析 //解析 StringBuilder没有add和set方法，append方法只有一个字符串类型的参数
    }
}
