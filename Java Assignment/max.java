import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        int n1, n2, n3, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three diffrent numbers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        max=n1;
        if(n2>max)
            max=n2;
        if(n3>max)
            max=n3;
        System.out.println("Maximum among 3 numbers is " + max);    
        sc.close();
    }
}