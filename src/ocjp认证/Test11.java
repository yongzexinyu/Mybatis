package ocjp认证;

public class Test11 {
    public int amount;
    public Test11(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
    public void changeAmount(int x){
        amount += x;
    }

    public static void main(String[] args) {
        Test11 acct = new Test11((int)(Math.random()*1000));
        //line n1
      //  acct.amount=0;
      //   acct.changeAmount(-acct.amount);
         acct.changeAmount(  -acct.getAmount());

        System.out.println(acct.getAmount());

    }
}
