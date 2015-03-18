interface inter
{
    int show(int c);
}

public class intlamda
{
    public static void main(String[] args) 
    {
      inter ob;
        ob=(x)->x%2;
        /*if(ob.show(89)==1)
        {
            System.out.println("yes !!!");
        }
          else 
        {
            System.out.println("no !!");
        }*/
        int p=ob.show(4);
        System.out.println(" "+p);
  //  ob.show();
    }
    
}
