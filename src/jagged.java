/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */
import java.util.Scanner;
/**
 *
 * @author Suraj
 */
public class jagged {
    public static void main(String ...a)
    {
        int sum=0;
        int ar[][]=new int[5][];
        ar[0]=new int[5];
        ar[1]=new int[3];
        ar[2]=new int[2];
        ar[3]=new int[1];
        ar[4]=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements of the array");
        for(int i=0;i<ar.length;i++)
        {
            System.out.println("enter "+ar[i].length+" elements for row "+(i+1)+" :");
            for(int j=0;j<ar[i].length;j++)
            {
                ar[i][j]=sc.nextInt();
                sum=sum+ar[i][j];
            }
        }
        System.out.println("the Zagged array is :");
        System.out.println();
        for(int x[]: ar)
        {
            for(int ab:x)
            {
                System.out.print(ab+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("the sum is :"+sum);
    }
}
