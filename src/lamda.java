interface lameda
{
    void show();
    
}
public class lamda 
{
    public static void main(String[] args) 
    {
        lameda o;
        o=()->System.out.println("hello");
        o.show();
    }

}
