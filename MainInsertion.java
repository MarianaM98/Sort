public class MainInsertion {
    
    public static void main(String[] args) {
        
        Insertion ins = new Insertion();
        int data[] = {9,4,3,10,7,8,7,2,1,6};
        ins.insertionSort(data, 10);
        for (int element: data) 
        {
           System.out.println(element);
        }
    }
}