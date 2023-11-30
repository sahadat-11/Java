package Java_Practice_Set_String;
import java.util.HashMap;
import java.util.Scanner;
public class Number_Of_Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(hashMap.containsKey(ch)) {
                cnt = hashMap.get(ch);
                cnt++;
                hashMap.replace(ch, cnt);
            }
            else {
                hashMap.put(ch, 1);
            }
        }
        for(Character key : hashMap.keySet()) {
            System.out.println(key + " = " +hashMap.get(key));
        }
    }
}
