import java.util.*;
class Armstrong{
  public static void main(String[]args)
  {
     System.out.println("Enter a number");
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int temp=num,sum=0;
     while(num>0)
     {
        int x=num%10;
        sum+=(x*x*x);
        num=num/10;
     }
     if(temp==sum)
     {
         System.out.println(temp+" "+"is an armstrong number");
     }
     else
     {
         System.out.println(temp+" "+"is not an armstrong number");
     }
  }
}
