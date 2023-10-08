import java.lang.constant.Constable;
import java.util.*;

class Result{
    public int n;
    int flag=0;
    public void getInt(int n){
        if(n==0||n==1){
            System.out.println("not prime");
        }
        else{
            for(int i=2; i<=n/2; i++){
                if(n%2==0){
                    System.out.println("not prime");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("prime");
            }
        }
    }
}
public class Prime {
    public static void main(String[] args){
    Result r1 = new Result();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Number to be checked: ");
    int n = sc.nextInt();
    r1.n = n;

    r1.getInt(n);
    }
}
