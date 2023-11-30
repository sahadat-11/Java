package Java_Practice_Set_String;
import java.util.HashMap;
import java.util.Scanner;
public class K_anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int k = sc.nextInt();
        if (s1.length() != s2.length()) {
            System.out.println("No");
        }
        int cnt = 0;
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(hashMap.containsKey(ch)) {
                cnt = hashMap.get(ch);
                cnt++;
                hashMap.replace(ch, cnt);
            }
            else {
                hashMap.put(ch, 1);
            }
        }
        for(int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if(hashMap.containsKey(ch)) {
                cnt = hashMap.get(ch);
                cnt--;
                hashMap.replace(ch, cnt);
            }
            else {
                hashMap.put(ch, 1);
            }
        }
        int count = 0;
        for(Character key : hashMap.keySet()) {
            count += hashMap.get(key);
        }
        //System.out.println(count);
        if(k > count) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}

//// Java program to check if two strings are k anagram
//// or not.
//
//import java.io.*;
//import java.util.*;
//
//class GFG {
//	public static boolean areKAnagrams(String s1, String s2, int k)
//	{
//		// code here
//		if (s1.length() != s2.length()) {
//			return false;
//		}
//
//		Map<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < s1.length(); i++) {
//			char ch = s1.charAt(i);
//			map.put(ch, map.getOrDefault(ch, 0) + 1);
//		}
//
//		for (int i = 0; i < s2.length(); i++) {
//			char ch = s2.charAt(i);
//			if (map.getOrDefault(ch, 0) > 0) {
//				map.put(ch, map.get(ch) - 1);
//			}
//		}
//
//		int count = 0;
//		for (char ch : map.keySet()) {
//			count += map.get(ch);
//		}
//
//		if (count > k)
//			return false;
//		else
//			return true;
//	}
//	public static void main(String[] args)
//	{
//		String str1 = "anagram";
//		String str2 = "grammar";
//		int k = 2;
//		if (areKAnagrams(str1, str2, k))
//			System.out.println("Yes");
//		else
//			System.out.println("No");
//	}
//}
//// This code is contributed by Raunak Singh

