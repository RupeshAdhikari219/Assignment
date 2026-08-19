import java.util.Scanner;
class Triangle {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of the triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a == b && b == c)
        System.out.println("Equilateral");
        else if(a != b && b != c && a != c)
        System.out.println("Scalene");
        else
        System.out.println("Isosceles");
        sc.close();
    }
}