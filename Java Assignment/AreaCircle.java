import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args) {
        int radi;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radi = sc.nextInt();
        area= 3.14*radi*radi;
        System.out.println("Area of Circle:"+ area);
        sc.close();
    }
}