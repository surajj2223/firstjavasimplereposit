/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suraj
 */ //
public class inheritance 
{
   private int empid;
    String empname;
    void set(int empid,String empname)
    {
        this.empid=empid;
        this.empname=empname;
    }
    void show()
    {
        System.out.println(empid+" "+empname);
    }}
    class mng extends inheritance
    {
        int ta,da;
        void set(int empid,String empname,int ta,int da)
        {
            set(empid,empname);
            this.ta=ta;
            this.da=da;
        }
        void show()
        {
            super.show();
            System.out.println(ta+" "+da);
        }
    }

class hey
{
    public static void main(String ...a)
    {
        mng m=new mng();
        m.set(522,"surajj",23, 56);
        m.show();
    }
}