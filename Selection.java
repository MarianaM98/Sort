import java.util.*;
public class Selection {
    //Funcion tomada de: Data Structures in Java for the Principled Programmer
    //Duane A. Bailey
    public int[] selection(int data[],int n)
    {
        int numUnsorted=n;
        int index;
        int max;
        int temp;
        while(numUnsorted>0)
      {
          //determine maximum value in array
          max=0;
          for(index=1; index< numUnsorted; index++)
            {
                if(data[max]< data[index]) 
                {
                    max=index;
                }
            }
            //swap numUnsorted-1 and max
            temp=data[max];
            data[max]=data[numUnsorted-1];
            data[numUnsorted-1]=temp;
            numUnsorted--;
        }
        return(data);
    }
}
