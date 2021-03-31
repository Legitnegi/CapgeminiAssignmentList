package heloo;
import java.util.*;
public class Assignment1Q6{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the creditials");
      String user=sc.nextLine();
      String password=sc.nextLine();
      Login l=new Login();
      System.out.println(l.loginUser(user,password));

    }
}
