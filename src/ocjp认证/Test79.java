package ocjp认证;

public class Test79 {
    String title;
    int value;
    public Test79(){
        title+="World!";
    }
    public Test79(int value){
        this();
        System.out.println(title);
        this.value=value;
        title="Hello";

    }


    public static void main(String[] args) {
        Test79 c=new Test79(5);
        System.out.println(c.title);
    }
}
