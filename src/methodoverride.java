
public class methodoverride {
    int rno;String name;
    void get(int rno, String name)
    {
     
        this.rno=rno;
        this.name=name;
    }
    void set()
    {
        System.out.println("rno is "+rno+" name "+name);
    }
}
class derived extends methodoverride
{
    int ta;int da;
    void get(int rno,String name,int ta,int da)
    {
        get(rno,name);
        //System.out.println("ta is "+ta+" da is "+da);
        this.ta=ta;
        this.da=da;
    }
    //@Override
    void set()
    {
        super.set();
        System.out.println("ta is "+ta+" da is "+da);
    }
}
class hello
{
    public static void main(String ...ar)
    {
     derived o=new derived();   
    o.get(45,"surajj",450,567);
    o.set();
    }
} 
