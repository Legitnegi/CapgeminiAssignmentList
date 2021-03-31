package bubble;
import java.util.*;
class BubbleSort{
      public void bubbleSort(int arr[])
      {
         int temp=0;
         int size=arr.length;
         for(int i=1;i<size;i++)
         {
           for(int j=0;j<size-i;j++)
           {
             if(arr[j]>arr[j+1])
		       	{
				       temp=arr[j];
				       arr[j]=arr[j+1];
				       arr[j+1]=temp;
			      }
           }
         }

      }
}
