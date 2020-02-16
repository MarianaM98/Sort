public class MainMerge {
    
    public static void main(String[] args) {
        
        Merge merg = new Merge();
        int data[] = {9,4,3,10,7,8,7,2,1,6};
        merg.mergeSort(data, 10);
        for (int element: data) 
        {
           System.out.println(element);
        }
    }
}