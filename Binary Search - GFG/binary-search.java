//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int l = 0;
        int r = n - 1;

        int mid = r / 2;

        if (arr[mid] == k) {
            return mid;
        } else if (arr[mid] < k) {
            l = mid + 1;
        } else {
            r = mid - 1;
        }

        for (int i = l; i < r+1; i++) {
            if (arr[i] == k) {
                return i;
            }
        }

        return -1;
    }
}