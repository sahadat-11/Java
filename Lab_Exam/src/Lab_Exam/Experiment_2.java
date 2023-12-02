package Lab_Exam;
import java.util.Scanner;
public class Experiment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split("\\W");
        for(int i = 0; i < words.length; i++) {
            //System.out.println(words[i]);
            if(words[i].startsWith("b")) {
                System.out.println(words[i]);
            }
        }
    }
}
