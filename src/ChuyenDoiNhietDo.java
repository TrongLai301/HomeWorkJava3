import java.util.*;
public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double celsius,fahrenheit;
        int choice;
        do{
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:{
                    System.out.print("Enter fahrenheit: ");
                    fahrenheit= sc.nextInt();
                    System.out.println("Fahrenheit to Celsius: "+ fahrenheittoCelsius(fahrenheit));
                    break;}
                case 2:{
                    System.out.print("Enter celsius: ");
                    celsius= sc.nextInt();
                    System.out.println("Fahrenheit to Celsius: "+ celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        }while(choice!=0);
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit= (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheittoCelsius(double fahrenheit){
        double celsius=(5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}

