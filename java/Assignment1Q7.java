package array;
import java.util.*;
public class Assignment1Q7{
    public static void main(String[] args) {
        //int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        //int valueToCheck = 19;
      
      int[]arr=new int[15];
      System.out.println("enter the element of array");
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<15;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println("enter the element to be searched");
      int value=sc.nextInt();
      SearchArray x=new SearchArray();
      System.out.println(x.searchArray(arr,value));
}
}
