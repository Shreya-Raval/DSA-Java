import java.util.Scanner;
public class ArmstrongWithoutInbuilt {
    public static int powerFunction(int base, int counter){
        int power = 1;
        for(int i = 1; i<= counter; i++){
            power *= base;
        }
        return power;
    }
    public static boolean isArmstrong(int num){
        if( num < 0 ) return false;
        if( num == 0 ) return true;
        int tempNum = num;
        int counter = 0;
        while( tempNum > 0){
            counter ++;
            tempNum /= 10;
        }
        int powCheckNum = 0;
        tempNum = num;


        while(tempNum > 0){
            int base = tempNum % 10;
            powCheckNum += powerFunction(base,counter);
            tempNum /= 10;
        }
        // return powCheckNum == num;
        if(powCheckNum == num){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = isArmstrong(num);
        System.out.println(result);
        sc.close();
    }
}
