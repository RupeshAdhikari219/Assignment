import java.util.Scanner;
public class PrimeComposite {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (n <= 1) {
            System.out.println("Neither Prime nor Composite");
        }
        else if (count == 2) {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Composite number");
        }
        sc.close();
    }
}