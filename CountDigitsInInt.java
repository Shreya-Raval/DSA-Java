import java.util.Scanner;
public class CountDigitsInInt {
    public static int countDigits(int n){
        int digitCount = 0;
        //long num = Math.abs((long)n);
        if(n < 0){
            n = -n;
        }
        if(n == 0) return 1;
        //System.out.println(n);
        while(n > 0){
            digitCount++;
            n /= 10;
            //System.out.println(currentDigit);
        }
        return digitCount;
    }
    public static void main(String[] args){
        int n = -123434334;
        int result = countDigits(n);
        System.out.println(result);
    }
}
