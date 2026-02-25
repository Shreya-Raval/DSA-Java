public class Factorial {
    public static int recursiveFactorial(int n){
        if(n < 0 ) return -1;
        if(n == 0 || n == 1) return 1;
        return n * recursiveFactorial(n - 1);
    }
    public static void main(String[] args){
        int number = 5;
        int result = recursiveFactorial(number);
        System.out.println(result);
    }
}
