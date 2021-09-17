package ocjp认证;

public class Test57 {

        void readCard(int cardNo) throws Exception {

                System.out.println("Reading Card");

        }
        void checkCard(int cardNo) throws RuntimeException { //line1
            System.out.println("Checking Card");
        }
        public static void main(String[] args) {
            Test57 ex = new Test57();
            int cardNo = 12344;
            ex.checkCard(cardNo); //line2
           // ex.readCard(cardNo);  //line3
            //解析 创建方法时，可以使用throws将可能发生的异常抛出，抛出以后该方法就不需要用try-catch来处理，当调用一个含有throws声明异常抛出的方法时，要求必须处理该异常，而处理方式有两种：1）使用try-catch捕获并解决异常，2）在当前方法上继续使用throws声明该异常的抛出。


        }

    }

