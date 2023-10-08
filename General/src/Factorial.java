import java.util.Scanner;

class Res{
    int n, fact=1;
    String factS = "";
    public void getInt(int n) {
        for(int i = n; i>=1; i--){
            fact*=i;
            if (i==n) {
                factS += i;
            } else {
                factS += " * " + i;
            }
        }
        System.out.println(factS);
        System.out.println("Hence the factorial of " + n + " is " + fact);
    }
}

public class Factorial {
    public static void main(String[] args){
        Res r1 = new Res();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        r1.n = n;

        r1.getInt(n);
    }
}
