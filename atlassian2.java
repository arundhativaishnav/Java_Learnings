import java.io.*;
public class atlassian2 {
    // Simple java program to count
// number of elements with
// values in given range.
// function to count elements within given range

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int n = arr.length;
        int i = 1, j = 4;
        System.out.println(CountInRang(arr, n, i, j));


    }

    static int CountInRang(int[] arr, int n, int x, int y) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x && arr[i] <= y) {
                count++;
            }



        }
        return count;

    }
}