package dream;
import java.util.*;
class MyNameComp implements Comparator<Person>{
@Override
public int compare(Person e1, Person e2) {
   if(e1.getweight()!=e2.getweight())
    {
      if(e1.getweight() > e2.getweight()){
        return 1;
      } else {
        return -1;
        }
  }
  else
  {
    if(e1.getheight()>e2.getheight())
    {
      return 1;
    }
    else
    {
      return -1;
    }
  }
}
}
