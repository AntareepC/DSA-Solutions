import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        int count=0;
        // Count how many numbers are present
        for (int i=0;i<s.length();i++) {
            if(s.charAt(i)!='+') {
                count++;
            }
        }
        int arr[] = new int[count];
        int j=0;
        // Extract the numbers
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) != '+') {
                arr[j] = s.charAt(i) - '0';
                j++;
            }
        }
        // Sort using two loops
        for (int i=0;i<arr.length-1;i++) {
            for (int k=0;k<arr.length- 1-i; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
        // Print
        for (int i=0; i<arr.length;i++) {
            System.out.print(arr[i]);
            if (i!=arr.length-1) {
                System.out.print("+");
            }
        }
        sc.close();
    }
}