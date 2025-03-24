class A{
private String name; 
private int rollno;
public void setName(String newName)
{
    name=newName;
}
public String getName()
{
    return name;
}
public void setrollno(int newrollno)
{
    rollno=newrollno;
}
public int getRollno()
{
return rollno;
}
}
public class Encapsolution {
    public static void main(String[] args) {
        A student=new A();
        student.setName("Ashish");
        student.setrollno(17);
        System.out.println(student.getName());
        System.out.println(student.getRollno());
    }
    
}
