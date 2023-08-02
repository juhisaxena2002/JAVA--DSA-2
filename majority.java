public class majority {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,1,3};
        int res = find(arr);
        System.out.println(res);
    }
    public static int find(int arr[]){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
                //if(count>=((arr.length+1)/2)) return arr[i];
                if((count%2)!=0) return arr[i];
            }
        }
        return -1;
    }
}
