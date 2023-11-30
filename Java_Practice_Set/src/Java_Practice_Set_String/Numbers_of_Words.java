package Java_Practice_Set_String;
import java.util.Scanner;
public class Numbers_of_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine();
        int cnt = 1;
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') cnt++;
        }
        System.out.println(cnt);
        // approach 2 :
        int countWords = s.split("\\s").length;
        System.out.println(countWords);
    }
}
