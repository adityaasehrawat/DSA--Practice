package Hard;
import java.util.Scanner;
public class Eighteenth{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt(),exponent=sc.nextInt();
        System.out.println(Math.pow(base,exponent));
        sc.close();
    }
}