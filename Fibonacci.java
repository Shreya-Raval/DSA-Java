public class Fibonacci {
    public static int getFibonacciNumber(int number){
        if(number < 0) return -1;
        if(number == 0) return 0;
        if(number == 1) return 1;
        int previous = 0;
        int current = 1;
        int next = 0;
        for(int i = 2; i <= number; i++){
            next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }

    public static int fibonacciRecursive(int number){
        if(number == 0) return 0;
        if(number == 1) return 1;
        return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }
    public static void main(String[] args){
        int fibonacciNumber = 5;
//        int result = getFibonacciNumber(fibonacciNumber);
        int recursiveResult = fibonacciRecursive(40);
        System.out.println(recursiveResult);
//        System.out.println(result);
    }
}
