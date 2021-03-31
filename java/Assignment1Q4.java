package marks;
import java.util.*;
public class Assignment1Q4 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter marks of Subject1");
      double sub1=sc.nextDouble();
      System.out.println("Enter marks of Subject2");
      double sub2=sc.nextDouble();
      System.out.println("Enter marks of Subject3");
      double sub3=sc.nextDouble();
      ResultDeclaration x=new ResultDeclaration();
      System.out.println("output"+" "+x.declareResults(sub1,sub2,sub3));
    }
}
