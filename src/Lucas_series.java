/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suraj
 */
public class Lucas_series {
    public static void main(String ...ar)
    {
        int a=1,b=2,c=3,sum;
        System.out.print(a+","+b+","+c+",");
        for(int i=1;i<8;i++)
        {
            sum=a+b+c;
            System.out.print(sum+",");
            a=b;
            b=c;
            c=sum;
        }
    }
}
