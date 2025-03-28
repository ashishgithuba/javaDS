import java.util.Scanner;
public class Factorail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int factoraial =1;
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            factoraial= factoraial*i;
        }
System.out.println(factoraial);
    }
    
}
