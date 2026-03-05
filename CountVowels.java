import java.util.Scanner;
public class CountVowels {
    public static int countVowelsInString(String s){
        if(s.length() != 0){
            s = s.toLowerCase();
            int vowelCount = 0;
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vowelCount++;
                }
            }
            return vowelCount;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int result = countVowelsInString(inputString);
        System.out.println(result);
    }
}
