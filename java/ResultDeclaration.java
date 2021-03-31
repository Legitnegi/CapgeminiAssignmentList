package marks;
class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks)
    {
         if(subject1Marks>60&&subject2Marks>60&&subject3Marks>60)
             return "Passed";
         else if((subject1Marks>60&&subject2Marks>60)||(subject2Marks>60&&subject3Marks>60)||(subject1Marks>60&&subject3Marks>60))
             return "Promoted";
         else
             return "failed";
    }
}
