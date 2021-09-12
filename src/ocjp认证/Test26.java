package ocjp认证;

public class Test26 {
    private double length;
    private double height;
    private double area;

    public void setLength(double length){
        this.length = length;
        setArea();
    }
    public void setHeight(double height){
        this.height = height;
        setArea();
    }
    public void setArea(){
        area = length*height;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Test26 test26=new Test26();
        test26.setHeight(20.0);
        test26.setLength(20.0);
       test26.setArea();
    }
}
