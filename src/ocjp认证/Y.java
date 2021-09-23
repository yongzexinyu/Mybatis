package ocjp认证;

public class Y extends X {
    public void mX() {
        System.out.println("Xm2");
    }
    public void mY() {
        System.out.println("Ym");
    }

    public static void main(String[] args) {
        X xRef = new Y();
        Y yRef = (Y)xRef;
        yRef.mY();
        xRef.mX();

    }
}
