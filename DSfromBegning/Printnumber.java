
import java.util.Scanner;

public class Printnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to print");
        int num=sc.nextInt();
        int i=1;
        while(i<=num)
        {
            System.out.println(i);
            i++;
        }

    }
    
}
