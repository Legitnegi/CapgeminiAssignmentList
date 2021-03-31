import java.util.*;
class Armstrong2{
  public static void main(String[]args)
  {
     int num=100,temp;
     while(num<999)
     {
       temp=Armstrongnumber(num);
       if(temp==num)
           System.out.println(temp);
        num++;
     }
   }
  static int Armstrongnumber(int num)
   {
       int sum=0;
       while(num>0)
       {
         int x=num%10;
         sum+=(x*x*x);
         num=num/10;
       }
       return sum;
   }
 }
