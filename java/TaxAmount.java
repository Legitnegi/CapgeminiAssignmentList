package tax;
class TaxAmount{
    public double calculateTaxAmount(int ctc){
      if(ctc<=180000)
         return 0;
      else if((ctc>180000) && (ctc<=300000))
         return (10.0/100)*ctc;
      else if((ctc>300000) && (ctc<500000))
         return (20.0/100)*ctc;
      else
         return (30.0/100)*ctc;
    }
}
