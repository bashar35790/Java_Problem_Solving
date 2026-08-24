import java.util.Scanner;

public class InputVariable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        String name;
        double decimal;
        

        System.out.println("Enter a Number:");
        number = input.nextInt();
      
        System.out.println("Enter your name:");
        name = input.next(); //Use nextLine() to read the full name including spaces

        System.out.println("Enter a decimal number:");
        decimal = input.nextDouble();


        System.out.println("Your number is:"+ number);
        System.out.println("Your name is:"+ name);
        System.out.println("Your decimal number is:"+ decimal);

    }
}