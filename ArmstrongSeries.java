import java.util.Scanner;
public class ArmstrongSeries {
    public static int powerFunction(int base, int exponent){
        int resultNum = 1;
        for(int i = 1; i <= exponent; i++){
            resultNum *= base;
        }
        return resultNum;
    }
    public static boolean isArmstrong(int num){
        if(num < 0) return false;
        if(num == 0) return true;
        int tempNum = num;
        int digits = 0;
        while(tempNum > 0){
            digits++;
            tempNum /= 10;
        }

        tempNum = num;
        int checkNum = 0;
        while(tempNum > 0){
            int baseDigit = tempNum % 10;
            checkNum += powerFunction(baseDigit, digits);
            tempNum /= 10;
        }
        return (checkNum == num);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 1; i <= number; i++){
           boolean result = isArmstrong(i);
           if(result){
               System.out.print(i + " ");
           }
        }
        sc.close();
    }
}
