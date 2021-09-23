package ocjp认证;

public class Test70 {
    String name;
    Boolean contract;
    double salary;
    Test70(){
        //line1


    }
    public String toString() {
        // TODO Auto-generated method stub
        return name+":"+contract+":"+salary;
    }
    public static void main(String[] args) {
        Test70 e = new Test70();
        //line2
      /*  e.name="Joe";
        e.contract=true;
        e.salary=100;*/

        System.out.println(e);
    }

}
