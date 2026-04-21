import java.util.*;
class Main {
    public static void main(String[] arg) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int  i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int j= 0;
        // HashSet<Integer> set = new Hashset<>();
        
        for (int i=0; i<n; i++) {
            if(arr[i] != 0) {
               arr[j]=arr[i];
               j++;
            } 
        for(j=j;j<n;j++){
            arr[j]=0;
        }    
            System.out.println(arr.toString());
            
        }
        
    }
}