import java.util.*;
public class Insertion {
    //Funcion tomada de: Data Structures in Java for the Principled Programmer
    //Duane A. Bailey
    public void insertionSort(int data[],int n)
    {
        int numSorted=1;
        int index;
        while(numSorted<n)
        {
            //take the first unsorted value
            int temp =data[numSorted];
            //and insert it among the sorted
            for(index=numSorted;index>0;index--)
            {
                if(temp<data[index-1])
                {
                    data[index]=data[index-1];
                }
                else
                {
                    break;
                }
            }
            //reinsert value
            data[index]=temp;
            numSorted++;
        }
    }

}
