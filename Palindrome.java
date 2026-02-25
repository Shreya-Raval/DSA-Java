public class Palindrome {
    public static boolean isPalindrome(int number){
        if(number < 0) return false;
        int givenNum = number;
        int reverse = 0;
        while(number > 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        if(givenNum == reverse){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        int checkPalindrome = 0;
        boolean result = isPalindrome(checkPalindrome);
        if(result != false){
            System.out.println("This given number is a palindrome");
        } else {
            System.out.println("This given number is not a palindrome");
        }

    }
}
