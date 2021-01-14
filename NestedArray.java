
import java.util.Scanner;



public class NestedArray
{
    public static void main(String[] args)
    {
    	Scanner b=new Scanner(System.in);
    	System.out.println("Enter Number of rows");
        int r=b.nextInt();
    	String[][] a=new String[r][4]; 
       
       for(int i=0;i<r;i++)
       {
    	   for(int j=0;j<4;j++){
    	   if(j==0)
    		   {System.out.print("Enter Name Employ "+i+"\t");
    		   a[i][j]=b.nextLine();
    		   
    		   }
    	   else if (j == 1) 
               {System.out.print("Enter Car Number of Employ ");
               a[i][j]=b.nextLine();
               
               }
           else if (j == 2) 
               {System.out.print("Enter Pay of Employ "+i);
               a[i][j]=b.nextLine();
               
               }
           else 
           { System.out.print("Enter  BNM Employ "+i);
           a[i][j]=b.nextLine();
      
           }
           }}
       System.out.println("\tEmploy#\tPay\tCar#\tBNM");
       for(int i=0;i<r;i++)
       {
    	   for(int j=0;j<4;j++){
    		   
    		   if(j==4)
    		   {System.out.println("");}
    		   else { 
    			   System.out.print("\t");
    			   System.out.print(a[i][j]);
    		   }
    	   }
       }
}}
