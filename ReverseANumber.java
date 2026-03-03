import java.util.Scanner;
public class ReverseANumber {
    public static long reverseNum(long n){
        boolean isNegative = false;
        if(n < 0) {
            isNegative = true;
            n = Math.abs(n);
        }
        if(n == 0) return 0;
        long reversed = 0;
        while(n > 0){
            long lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n /= 10;
        }
        if(isNegative){
            reversed = -reversed;
        }
        return reversed;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long result = reverseNum(num);
        System.out.println(result);
        sc.close();
    }
}
