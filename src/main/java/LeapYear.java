import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int Year = sc.nextInt();

        if (((Year % 4 == 0) && (Year % 100!= 0)) || (Year%400 == 0)){
            System.out.println("The year is Leap Year");
        }else
            System.out.println("THe year is not leap year");

        sc.close();
    }
}