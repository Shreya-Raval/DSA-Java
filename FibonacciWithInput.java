import java.util.Scanner;
public class FibonacciWithInput{
    public static void printFibonacciSeries(int n){
        if(n < 0) return;
        int previous = 0;
        int current = 1;
        System.out.println(0);
        if(n >= 1){
            System.out.println(1);
        }
        int seriesNum;
        for(int i = 1; i <=n - 2; i++){
            seriesNum = previous + current;
            previous = current;
            current = i;
            System.out.println(seriesNum);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonacciSeries(n);
        sc.close();
    }
    public static void printFibonacciSeriesImproved(int n){
        if(n <= 0) return;

        int previous = 0;
        int current = 1;

        if(n >= 1) System.out.println(previous);
        if(n >= 2) System.out.println(current);

        for(int i = 3; i <= n; i++){
            int next = previous + current;
            System.out.println(next);
            previous = current;
            current = next;
        }
    }
}