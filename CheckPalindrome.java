import java.util.Scanner;
public class CheckPalindrome {
    public static boolean isPalindrome(long n){
        if(n <=0) return false;
        long reverse = 0;
        long tempN = n;
        while(tempN > 0){
            long currentLast = tempN % 10;
            reverse = reverse * 10 + currentLast;
            tempN /= 10;
        }
        if(reverse == n){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        boolean result = isPalindrome(num);
        System.out.println(result);
        sc.close();
    }
}
