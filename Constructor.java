class Ravi{
    int a;String name;
    Ravi()
    {
        a=17;name="Happy  Happy";
    }
    void show()
    {
        System.out.println(a+" "+name);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Ravi ref=new Ravi();
        ref.show();
    }
}
