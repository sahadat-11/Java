package Lab_Exam;
import java.util.Scanner;
class Employee{
    String First_name = new String();
    String Last_name = new String();
    double Monthly_salary;
    Employee(String f_n, String l_n, double sl){
        if(sl<0.0){
            Monthly_salary = 0.0;
        }
        else{
            Monthly_salary = sl;
        }
        First_name = f_n;
        Last_name = l_n;
    }
    void set_first_name(String f_n){
        First_name = f_n;
    }
    void set_last_name(String l_n){
        Last_name = l_n;
    }
    void set_monthly_salary(double sl){
        if(sl < 0){
            Monthly_salary = 0.0;
        }
        else Monthly_salary = sl;
    }
    String get_first_name(){
        return First_name;
    }
    String get_last_name(){
        return Last_name;
    }
    double get_monthly_salary(){
        return Monthly_salary;
    }
    double get_yearly_salary(){
        return Monthly_salary * 12.0;
    }
    double get_yearly_salary_with_raise(){
        double r = get_yearly_salary() * 0.1;
        return get_yearly_salary() + r;
    }
}
public class Experiment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Information for first employee\n");
        Employee ob = new Employee("Sahadat", " Hossain",-10000.0);
        System.out.print("Full name is: ");
        System.out.println(ob.get_first_name()+ob.get_last_name());
        System.out.print("Monthly salary is: ");
        System.out.println(ob.get_monthly_salary());
        System.out.print("Yearly salary is: ");
        System.out.println(ob.get_yearly_salary());
        System.out.print("Yearly salary with 10% raise is: ");
        System.out.println(ob.get_yearly_salary_with_raise());

        System.out.println("\n\nInformation for second employee\n");
        Employee ob2=new Employee("Sharif", " Ullah",150000.0);
        System.out.print("Full name is: ");
        System.out.println(ob2.get_first_name()+ob2.get_last_name());
        System.out.print("Monthly salary is: ");
        System.out.println(ob2.get_monthly_salary());
        System.out.print("Yearly salary is: ");
        System.out.println(ob2.get_yearly_salary());
        System.out.print("Yearly salary with 10% raise is: ");
        System.out.println(ob2.get_yearly_salary_with_raise());
    }
}
