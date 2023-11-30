package Java_Practice_Set_String;

import java.util.HashSet;
import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        HashSet<Character> hashSet = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                hashSet.add(ch);
            }
        }
        if(hashSet.size() == 26) {
            System.out.println("Panagram");
        }
        else {
            System.out.println("Not Panagram");
        }
    }
}
