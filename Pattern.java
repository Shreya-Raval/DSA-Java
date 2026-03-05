public class Pattern {
    public static void main(String[] args){
        // for increasing triangle
        /*
             *
             **
             ***
             ****
             *****
        */
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // for reverse triangle
        /*
             *****
             ****
             ***
             **
             *
         */
        for(int i = 1; i <= 5; i++){
            for(int j = i; j <= 5; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        //or

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= (5 - i) + 1; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        // for Number Triangle
        /*
            1
            12
            123
            1234
            12345
         */

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // same number pattern
        /*
            1
            22
            333
            4444
            55555
         */
        System.out.println();
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        /*
                *
               ***
              *****
             *******
            *********
         */

       for(int i = 1; i <= 5; i++){
           for(int j = i; j <= 4; j++){
               System.out.print(' ');
           }
           for(int k=1; k<= 2*i -1; k++){
               System.out.print('*');
           }
           System.out.println();
       }
       System.out.println();

       /*
            *********
             *******
              *****
               ***
                *
        */

        for(int i=1; i<=5; i++){
            for(int j= 1; j <= i - 1; j++){
                System.out.print(' ');
            }
            for(int k = 1; k <= 2*(5-i) + 1; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
