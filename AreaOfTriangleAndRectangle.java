import java.util.Scanner;
public class AreaOfTriangleAndRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double base, height, areaOfTriangle, length, width, areaOfRectangle;
        System.out.println("Enter the base of the triangle:");
        base = input.nextDouble();
        System.out.println("Enter the height of the triangle:");
        height = input.nextDouble();
        areaOfTriangle = .5 * base * height;
        System.out.println("The area of the triangle is:" + areaOfTriangle);

        System.out.println("Enter the length of the rectangle");
        length = input.nextDouble();
        System.out.println("Enter the width of the rectangle");
        width = input.nextDouble();
        areaOfRectangle = length * width;
        System.out.println("The area of the rectangle is:"+ areaOfRectangle);
    }
}