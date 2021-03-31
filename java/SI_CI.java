import java.util.*;
class SI_CI{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the principal amount");
    double principal=sc.nextDouble();
    System.out.println("enter the rate");
    double rate=sc.nextDouble();
    System.out.println("enter the time period");
    int time=sc.nextInt();
    double si=simpleInterest(principal,time,rate);
    double ci=compoundInterest(principal,time,rate);
    System.out.println("simpleInterest"+" "+si+"\n"+"compoundInterest"+" "+ci);
  }
  static double simpleInterest(double p,int t,double r)
  {
    double si=(p*r*t)/100;
    return si;
  }
  static double compoundInterest(double p,int t,double r)
  {
    double ci=p*Math.pow(1+(r/100),t)-p;
    return ci;
  }
}
