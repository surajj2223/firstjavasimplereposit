/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suraj
 */
public class copycons 
{
    int a,b;
    copycons()
    {
        a=6;b=8;
    }
    copycons(int x,int y)
    {
        a=x;b=y;
    }
    copycons(copycons c)
    {
        a=c.a;
        b=c.b;
    }
    void show()
    {
        System.out.println("a is "+a+" b is "+b);
    }
    public static void main(String ...a)
    {
                System.out.println();
       System.out.println("c1 object :");
        copycons c1=new copycons();
        c1.show();
                System.out.println();
       System.out.println("c2 object :");
        copycons c2=new copycons(4,5);
        c2.show();
        System.out.println();
       System.out.println("c3 object :");
        //copy construcor.....
        copycons c3=new copycons(c2);
        c3.show();
        //copy constructor......
        System.out.println();
       System.out.println("c4 object :");
       
        copycons c4=new copycons(c1);
        c4.show();
    }
}
