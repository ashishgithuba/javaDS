//package DSfromBegning;

import java.util.Scanner;

public class countoddnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<num;i++)
        {
if(i%2 !=0)
{
    System.out.print(i+" ");
    count++;
}        }
System.out.println("\nTotal odd numbers: " + count);

    }
    
}
