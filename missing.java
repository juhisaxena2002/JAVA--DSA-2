public class missing {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,5,7,9,8,10};
       // int res = find(arr, 10);
        int res =  xor(arr,10);
        System.out.println(res);
    }
    public static int find(int arr[], int n){
         n = 10;
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        for (int i = 1; i <=n; i++) {
            sum2 += i;
        }
        return sum2-sum1;

    }
    public static int xor(int arr[], int n){
        n=10;
        int x1=0;int x2=0;
        for (int i = 0; i < arr.length; i++) {
            x1 ^= arr[i];
        }
        for (int i = 1; i <= n; i++) {
            x2 ^= i;
        }
        return x1^x2;
    }
}
