//If N is odd → print "Weird"
//
//If N is even and 2–5 → print "Not Weird"
//
//If N is even and 6–20 → print "Weird"
//
//If N is even and >20 → print "Not Weird"
import java.util.Scanner;
public class ConditionBasedTrapQnA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 != 0 || num % 2 == 0 && num >= 6 && num <= 20){
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
