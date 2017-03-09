package arithmetic.math.chapter1;

/**
 * 求数组的平均值
 * 
 * @author wangc
 *
 */
public class AverageOfArray {

    public static void main(String[] args) {
        double[] a = { 3.21, 7.23, 9.9, 192.88, 2, 32.33 };
        double total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        double result =  total / a.length;
        System.out.println("average:"+result);
    }
}
