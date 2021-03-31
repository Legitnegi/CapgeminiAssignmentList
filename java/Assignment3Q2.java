package qwerty;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Assignment3Q2{
    public static void main(String[] args)
    {
         HashSet<hashsetvslinkedhashset> nameComp = new HashSet<hashsetvslinkedhashset>();
         LinkedHashSet<hashsetvslinkedhashset> nameComp1 = new LinkedHashSet<hashsetvslinkedhashset>();
         nameComp.add(new hashsetvslinkedhashset("Ram",56));
         nameComp.add(new hashsetvslinkedhashset("John",45));
         nameComp.add(new hashsetvslinkedhashset("Crish",86));
         nameComp.add(new hashsetvslinkedhashset("Tom",85));
         for(hashsetvslinkedhashset e: nameComp)
         {
           System.out.println(e);
         }
         System.out.println("============================================");
         nameComp1.add(new hashsetvslinkedhashset("Ram",56));
         nameComp1.add(new hashsetvslinkedhashset("John",45));
         nameComp1.add(new hashsetvslinkedhashset("Crish",86));
         nameComp1.add(new hashsetvslinkedhashset("Tom",85));
         for(hashsetvslinkedhashset e1: nameComp1)
         {
           System.out.println(e1);
         }

    }
  }
