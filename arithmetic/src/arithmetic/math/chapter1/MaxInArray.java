package arithmetic.math.chapter1;

/**
 * 求数组中的最大值
 * 
 * @author wangc
 *
 */
public class MaxInArray {
    public static void main(String[] args) {
        int[] a = { 32, 43, 13, 55, 123, 31, 99 };
        int max = a[0];
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("max:" + max);
    }

}
