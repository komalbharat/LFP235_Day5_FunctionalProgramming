import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        int i = 2;
        int answer = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power");
        int Power = sc.nextInt();
        int n = 0;

        for (n = 1; n <= Power; n++){
            answer = i * answer;

        }
        System.out.println(answer);
        sc.close();
    }

}