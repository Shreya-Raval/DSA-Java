public class ReverseNumber {
    // for negative number handle it like this:
    public static int reverse(int number) {
        int sign = 1;

        if(number < 0) {
            sign = -1;
            number = -number;
        }

        int reverseNumber = 0;

        while(number > 0){
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number /= 10;
        }

        return sign * reverseNumber;
    }
    public static void main(String[] args){
        // separate the main function and make other static reverse function to return int type, and better encapsulation and readability
      /* int number = 1234;
        int result = reverse(number);
        System.out.println(result); */
        int number = 1234;
        int reverseNumber = 0;
        while(number > 0){
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number /= 10;
        }
        System.out.println(reverseNumber);
    }
}