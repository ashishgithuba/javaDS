//package DSfromBegning;

import java.util.Scanner;

public class Evennumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i=2;
        while(i<=num)
        {
            System.out.println(i);
            i+=2;
        }

    }
    
}
