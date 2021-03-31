package array;
class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue)
    {
      for(int i=0;i<15;i++)
      {
        if(arr[i]==toCheckValue)
             return true;
      }
      return false;
    }
}
