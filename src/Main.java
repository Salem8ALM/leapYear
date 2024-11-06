import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year");

        int input = scanner.nextInt();

        if ((input%4 == 0 && input%100 !=0) || input%400 ==0 ){
            System.out.println("you've entered a leap year");
        }
        else{
            System.out.println("not a leap year");
        }
        scanner.close();
    }
}