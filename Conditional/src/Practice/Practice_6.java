package Practice;
import java.util.Scanner;
public class Practice_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
//        Random r = new Random();
//        int a = r.nextInt();
//        System.out.println(a);
    }
}
