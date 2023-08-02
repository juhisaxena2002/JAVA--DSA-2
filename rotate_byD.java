import java.util.Arrays;

public class rotate_byD {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int res[] = rotate(arr,3);
        System.out.println(Arrays.toString(res));
    }
    public static int[] rotate(int arr[], int d){
       
        int temp[] = new int[arr.length-d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int i=d;i<arr.length;i++){
           arr[i-d]=  arr[i];
        }
        int j=0;
        for(int i=arr.length-d;i<arr.length;i++){
            arr[i] = temp[j];
            j++;
        }
        return arr;
    }
}
