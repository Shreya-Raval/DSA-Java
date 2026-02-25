public class Armstrong {
    public static boolean isArmstrong(int n){
        if(n > 0){
           int number = n;
           int digits = 0;
           int sum = 0;
           int temp = n;
           while(temp > 0){
               temp /= 10;
               digits++;
           }
           temp = n;
           while(temp>0){
               int lastDigit = temp%10;
               sum += Math.pow(lastDigit,digits);
               temp /= 10;
           }
           System.out.println(sum);
           System.out.println(digits);
           if(number == sum) return true;
           return false;
        }
        return false;
    }
    public static void main(String[] args){
        int myNum = 153;
        boolean result = isArmstrong(myNum);
        System.out.println(result);
    }
}
