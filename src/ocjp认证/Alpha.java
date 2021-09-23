package ocjp认证;

public class Alpha {
    public String[]main=new String[2];
    Alpha(String[]main) {
        for (int ii = 0; ii<main.length; ii++) {
            this.main[ii]=main[ii]+5;
        }
    }
    public void main() {
        System.out.print(main[0]+main[1]);
    }

}
