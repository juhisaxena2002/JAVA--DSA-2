import java.util.Scanner;

public class sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Boolean res = isSorted(arr, size);
        System.out.println(res);
        
       
    }
    public static Boolean isSorted(int arr[], int size){
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[j]<arr[i]) 
                    return false;
                }
            }
            return true;
           
    }
}
