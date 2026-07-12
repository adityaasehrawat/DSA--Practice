package Hard;
import java.util.Scanner;
class Seventeenth{
    static public void display(int total,double avg,char grade){
        System.out.println("Total: "+total); 
        System.out.println ("Average: "+avg);
        System.out.println("Grade: "+grade);
    } 
    public static voi d main(String []  args)
        Scanner sc=new Scanner(System.in); 
        String name = sc.next();
        int  a=sc.nextInt(),b=sc.nextInt(),c =sc.nextInt();
        int total=a+b+c;
        double avg=total/3;
        sc.close();
        char grade;
        if(avg>=75) grade = 'A';
        else if(avg >= 60) grade = 'B';
        else if(avg >= 50) grade = 'C';
        else grade = 'F';
        display(total,avg,grade);
    }
} 