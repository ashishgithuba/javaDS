//package DSfromBegning;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int r;
        while(num>0)
        {
            r=num%10;
            System.out.print(r);
            num=num/10;
        }

        
    }
    
}
