package tax;
import java.util.*;
public class Assignment1Q5{
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ctc of a person");
        int ctc=sc.nextInt();
        TaxAmount x=new TaxAmount();
        System.out.println("Tax to be paid"+" "+x.calculateTaxAmount(ctc));
    }
}
