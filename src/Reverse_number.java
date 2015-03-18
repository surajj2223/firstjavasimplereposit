/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Suraj
 */
public class Reverse_number {
    public static void main(String ...ar)
    {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x=o.nextInt();
        int ri=x,res,r=0;
        while(ri>=1)
        {
            res=ri%10;
            r=(r+res)*10;
            ri=ri/10;
        }
        r=r/10;
        System.out.println("the reverse is "+r);
        
        
    }
    
}
