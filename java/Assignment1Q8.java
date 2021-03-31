package bubble;
public class Assignment1Q8{
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        BubbleSort x=new BubbleSort();
        x.bubbleSort(arr);
        for(int a:arr)
        {
          System.out.println(a+" ");
        }
    }
}
