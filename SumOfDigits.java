import java.util.Scanner;
public class SumOfDigits {
    public static int sumOfDigits(int n){
        n = Math.abs(n);
        int sum = 0;
        int currentDigit = 0;
        while(n > 0){
            //sum += n % 10;
           currentDigit = n % 10;
           sum += currentDigit;
           n /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = sumOfDigits(num);
        System.out.println(result);
    }
}
