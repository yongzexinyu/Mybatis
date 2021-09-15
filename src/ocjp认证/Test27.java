package ocjp认证;

public class Test27 {

    void readCard(int cardNo) throws Exception {
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException { // line n1
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {
        Test27 ex = new Test27();
        int cardNo = 12344;
        ex.checkCard(cardNo);                //line n2
       // ex.readCard(cardNo);                 //line n3
    }

}
