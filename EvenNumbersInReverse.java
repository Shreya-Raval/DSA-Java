public class EvenNumbersInReverse {
    public static void printEvenNumbers(){
        for(int i = 100; i >= 2; i--){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        printEvenNumbers();
    }
}
