public class MainRadix {
    
    public static void main(String[] args) {
        
        Radix rad = new Radix();
        int data[] = {9,4,3,10,7,8,7,2,1,6};
        rad.radixSort(data, 10);
        for (int element: data) 
        {
           System.out.println(element);
        }
    }
}