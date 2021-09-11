package ocjp认证;

public class Test17 {
    public static void main(String[] args) {
        int nums1[] = new int[3];
        int nums2[] = {1, 2, 3, 4, 5,6,7,8};
        nums1 = nums2;

        for (int x : nums1){
            System.out.print(x + ":"); //s1:2:3:4:5:6:7:8:
        }

//解析 地址引用的变换
    }
}
