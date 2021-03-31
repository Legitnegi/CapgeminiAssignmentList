import java.util.*;
public class Assignment3Q3{
    public static void main(String[] args)
    {
      List<Integer>list=new ArrayList<>();
      System.out.println("Enter the number of element");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        int x=sc.nextInt();
        list.add(x);
      }
      ListIterator<Integer> li = list.listIterator();
      while (li.hasNext()) {
         li.next();
      }
      System.out.println("The ArrayList elements in the reverse direction are: ");
      while (li.hasPrevious()) {
         System.out.println(li.previous());
      }

    }
}
