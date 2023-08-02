public class odd_num {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,2,1,3,3,3,3,2};
        int res = odd_times(arr);
        System.out.println(res);
    }
    public static int odd_times(int arr[]){
      
        for (int i = 0; i < arr.length; i++) {
              int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]) count++;
                
            } 
            if(count%2!=0) return arr[i];
            //count=1;
            
           
        }
         return -1;
    }
}
