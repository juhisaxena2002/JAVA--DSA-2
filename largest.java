public class largest {
    public static void main(String[] args) {
        int arr[] = {90001,2,3,4,10,56,900};
        int max = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
