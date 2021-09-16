package ocjp认证;

import java.io.IOException;

public class Test51 {
    public void printFileContent() throws IOException {
        				/* code goes here */
                				throw new IOException();

        			}
    	}

class Testa{
    public static void main(String[] args) {
        Test51 test51=new Test51();
        try {
            test51.printFileContent();
        } catch (Exception e) { }
      //  catch (IOException e) { }//Exception是所有异常的父类 已经包含了IOException不需要重新捕获

    }

        }
