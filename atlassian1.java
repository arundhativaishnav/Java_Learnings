import java.util.*;
public class atlassian1 {

        public static void main(String[] args){
            int[] arr={1,2,3,1,4,1,1,6};
            int ans= majorityElement(arr);
            System.out.println(ans);
        }

        static int majorityElement(int[] arr){
            int n = arr.length;
            int candidate = -1;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                } else if (candidate == arr[i]) {
                    count++;
                } else {
                    count--;
                }
            }

            count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == candidate) {
                    count++;
                }
            }

            if (count > n / 2) {
                return candidate;
            } else {
                return -1;
            }
        }
    }
