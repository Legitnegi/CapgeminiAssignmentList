package app;
class Student{
    private int subjectA,subjectB,subjectC;

    public int studentsTotalMarksInAllSubjects(Student[] students)
     {
       int sum=0;
       for(int a:students)
       {
         sum=sum+a;
       }
       return sum;
     }
    public double studentsAverageMarksInAllSubjects(Student[] students)
     {
       int size=students.length;
       int sum=0;
       for(int a:students)
       {
         sum=sum+a;
       }
       return sum/size;
     }
    public int[] subjectWiseMarks(Student[] students,String subjectName)
    
    public int subjectATotalByStudents(int[] marks) {}
    public int subjectBTotalByStudents(int[] marks) {}
    public int subjectCTotalByStudents(int[] marks) {}

   public int subjectTotalByStudents(int[] marks)

    public double subjectAAverageByStudents(int[] marks) {}
    public double subjectBAverageByStudents(int[] marks) {}
    public double subjectCAverageByStudents(int[] marks) {}

}
