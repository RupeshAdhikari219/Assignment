import java.util.Scanner;
public class Middle{
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three diffrent numbers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        if((n1<n2 && n1>n3)||(n1<n3 && n1>n2))
        System.out.println("Middle number is"+ n1);
        else if((n2<n3 && n2>n1)||(n2>n3 && n2<n1))
        System.out.println("Middle number is"+ n2);
        else
        System.out.println("Middle number is"+n3 );
        sc.close();
    }
}