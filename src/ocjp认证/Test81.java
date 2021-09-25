package ocjp认证;

public class Test81 {

        public static void main(String[] args) {

            String test="a1b2c3";
            String[] tokens=test.split("\\d");//spilt表示正则表达式 d表示0-9的数字 需要\\进行转义
            for(String s:tokens){
                System.out.println(s+"");
            }
        }
}
