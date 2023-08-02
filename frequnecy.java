import java.util.HashMap;
import java.util.Scanner;

public class frequnecy {
    public static void main(String[] args) {
        // HashMap<Character,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
             int count = 0;
             for (int i = 0; i < str.length(); i++) {
                if(ch == str.charAt(i)){
                    count++;
            }
           
        }
        if(count!=0)
        System.out.println(ch +" " + count);
        
    }
       



    }
}
