package dream;
class Person{
    private String name;
    private int height;
    private double weight;
    public Person(String name,int height,double weight)
    {
      this.name=name;
      this.height=height;
      this.weight=weight;
    }
    public String getName()
    {
      return name;
    }
    public int getheight()
    {
      return height;
    }
    public double getweight()
    {
      return weight;
    }
    public String toString(){
        return "Name: "+this.name+"-- Weight: "+this.weight+"-- Height: "+this.height;
    }
}
