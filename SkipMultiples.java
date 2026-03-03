public class SkipMultiples {
    //Print numbers 1–100 but skip multiples of 3.
    public static void printNumbers(){
        for(int i = 1; i<= 100; i++){
            if(i %3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        printNumbers();
    }
}
