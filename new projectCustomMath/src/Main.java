import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a and b,n");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        int n = scan.nextInt();
        int an= (int) a;
        int bn=(int) b;
        System.out.println("Plus:"+CustomMath.plus(an,bn));
        System.out.println("Plus(double):"+CustomMath.plus(a,b));
        System.out.println("Minus:"+CustomMath.minus(an,bn));
        System.out.println("Minus(double):"+CustomMath.minus(a,b));
        System.out.println("Pow:"+CustomMath.pow(an,n));
    }
}