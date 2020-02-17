import java.util.*;
public class Merge {
    //Funcion tomada de: Data Structures in Java for the Principled Programmer
    //Duane A. Bailey
    public void merge(int data[],int temp[], int low, int middle, int high)
    {
        int ri = low;
        int ti= low;
        int di =middle;
        //while two lists are not empty merge smaller value
        while(ti<middle && di <=high)
        {
            if(data[di]<temp[ti])
            {
                data[ri++]=data[di++];
                //smaller is in high data
            }
            else
            {
                data[ri++]=temp[ti++];
                //smaller is in temp
            }
        }
        while(ti<middle)
        {
            data[ri++]=temp[ti++];
        }
    }
    
    public void mergeSortRecursive(int data[],int temp[], int low, int high)
    {
        int n = high-low+1;
        int middle= low+n/2;
        int i;
        if(n<2)
            //move lower half of data into temporary storage
        {
            return;
        }
        for(i=low; i<middle; i++)
        {
            temp[i]=data[i];
        }
        //sort lower half of array
        mergeSortRecursive(temp,data,low,middle-1);
        //sort upper half of array
        mergeSortRecursive(data,temp,middle,high);
        //merge halves together
        merge(data,temp,low,middle,high);
    }
    
    public void mergeSort(int data[], int n)
    {
        mergeSortRecursive(data,new int[n],0,n-1);
    }

}
