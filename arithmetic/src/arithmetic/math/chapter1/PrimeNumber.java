package arithmetic.math.chapter1;

/**
 * 素数判断 素数：大于1的自然数中，除了1和它本身没有其他因数
 * 
 * @author wangc
 *
 */
public class PrimeNumber {
    
    public static void main(String[] args) {
        System.out.println(isPrime(1));
//        Math.sqrt(a)args;
    }

    public static boolean isPrime(int p) {
        if (p < 2) {
            return false;
        } else {
            for (int i = 2; i < p; i++) {
                if (p % i == 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }

        return true;
    }

}
