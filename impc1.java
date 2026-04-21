import java.util.Scanner;

public class impc1 {
  public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int  i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int  j= 0;
        for (int i =0; i<n; i++) {
          if(arr[i] != 0) {
            int temp = arr[i];
            arr[j] = arr[i];
            arr[i] = temp;
            j++;
            
          // or 
          // XOR swap (only when i != j)
          // if (i != j) {
          //     arr[i] = arr[i] ^ arr[j];
          //     arr[j] = arr[i] ^ arr[j];
          //     arr[i] = arr[i] ^ arr[j];
          // }

          }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // xor way 

  }
}
