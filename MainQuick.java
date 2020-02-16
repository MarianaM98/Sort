public class MainQuick {
    
    public static void main(String[] args) {
        
        Quick qui = new Quick();
        int data[] = {9,4,3,10,7,8,7,2,1,6};
        qui.quickSort(data, 0,9);
        for (int element: data) 
        {
           System.out.println(element);
        }
    }
}