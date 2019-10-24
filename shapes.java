import java.util.Scanner;

public class shapes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String shape = "";
        double length = 0;
        double width = 0;
        double area = 0;
        double side = 0;
        double radius = 0;
        double base = 0;
        double height = 0;

        while (shape != "circle" || shape != "rectangle" || shape != "square" || shape != "triangle" ) {
          System.out.print("Enter a shape: ");
          shape = in.nextLine();
        }

        if (shape == "circle"){
          System.out.print("Enter a radius: ");
          radius = in.nextDouble();
          area = radius * radius * 3.14;
          System.out.printf("%,d.", area);
        } else if (shape == "rectangle") {
            System.out.print("Enter a length: ");
            length = in.nextDouble();
            System.out.print("Enter a width: ");
            width = in.nextDouble();
            area = length * width;
            System.out.printf("%,d.", area);
        } else if (shape == "square") {
            System.out.print("Enter a side length: ");
            side = in.nextDouble();
            area = side * side;
            System.out.printf("%,d.", area);
        } else if (shape == "triangle") {
            System.out.print("Enter a base length: ");
            base = in.nextDouble();
            System.out.print("Enter a height: ");
            height = in.nextDouble();
            area = (base * height)/2;
            System.out.printf("%,d.", area);
        }


        in.close();
    }
}
