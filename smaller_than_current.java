import java.util.Arrays;

public class smaller_than_current {
    public static void main(String[] args) {
        int res[] = {8,1,2,2,3};
        int[] ans = find(res);
        System.out.println(Arrays.toString(ans));
    }
    public static int [] find(int arr[]){
        //Arrays.sort(arr);
      
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
              int count=0;
            for (int j = 0; j < arr.length; j++) {

                if(i!=j && arr[i]>arr[j]){
                    count++;
                }
                res[i] = count;
                //count=0;
            }
        }
        return res;
    }
}
