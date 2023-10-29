import java.util.List;
//package Sample;
public class String_sample {
    public static void main(String[] args) {
        var s = "Sahadat";
        System.out.println(s);
        var names = List.of("Julie", "Robert", "Chris", "Joseph");
        for (var name : names) {
            System.out.println(name);
        }
        System.out.println("");
        for (var i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));// get is build in function
        }
    }
}
