import java.util.*;
public class Selection {
    
    public int[] selection(int data[],int n)
    {
        int numUnsorted=n;
        int index;
        int max;
        int temp;
        while(numUnsorted>0)
      {
          max=0;
          for(index=1; index< numUnsorted; index++)
            {
                if(data[max]< data[index]) 
                {
                    max=index;
                }
            }
            temp=data[max];
            data[max]=data[numUnsorted-1];
            data[numUnsorted-1]=temp;
            numUnsorted--;
        }
        return(data);
    }
}