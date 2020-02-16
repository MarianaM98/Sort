public class MainSelection {
    
    public static void main(String[] args) {
        
        Selection select = new Selection();
        int data[] = {9,4,3,10,7,8,7,2,1,6};
        select.selection(data, 10);
        for (int element: data) 
        {
           System.out.println(element);
        }
    }
}