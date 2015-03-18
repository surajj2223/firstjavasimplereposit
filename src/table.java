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
//table of a given number........
public class table {
    public static void main(String ...ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int x=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int tb=x*i;
            System.out.println(x+"x"+i+"="+tb);
        }
    }
    
}
