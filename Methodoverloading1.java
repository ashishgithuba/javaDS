class A{
    void add()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
void add(int x,int y)
{
int c;
c=x+y;
System.out.println(c);


}
void add(int x,double y){
double c;
c=x+y;
System.out.println(c);
}
}
public class Methodoverloading1 {
    public static void main(String[] args) {
        A reff=new A();
       reff.add();
        reff.add(40,20.9);
        reff.add(10,30);
        
    }
    
}
