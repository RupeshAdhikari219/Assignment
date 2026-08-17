import java.util.Scanner;
public class VolumeCube {
    public static void main(String[] args) {
        int length;
        double cube;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Cube");
        length = sc.nextInt();
        cube = Math.pow(length, 3);
        System.out.println("Volume of a cube:"+ cube);
        sc.close();
    }
}