package dream;
import java.util.TreeSet;
public class Assignment3Q1{
    public static void main(String[] args)
    {
      TreeSet<Person> nameComp = new TreeSet<Person>(new MyNameComp());
       nameComp.add(new Person("Ram",165,56));
       nameComp.add(new Person("John",145,45));
       nameComp.add(new Person("Crish",167,56));
       nameComp.add(new Person("Tom",155,55));
       for(Person e:nameComp){
           System.out.println(e);
       }
    }
}
