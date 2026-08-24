import java.util.Scanner;
public class TemparatureConvert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double celsius;
        System.out.print("Enter temperature in Celsius:");
        celsius = input.nextDouble();
        double fahrenheit = 9/5 * celsius + 32;
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");

    }
}