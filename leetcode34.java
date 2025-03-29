//leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class leetcode34 {
    public static void main(String[] args) {

    }
    static int[] binarysearch(int [] nums , int target){

        int [] ans = {-1 , -1};
        //check for the first occurence
        int start = search(nums ,target, true);
        int end = search(nums ,target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int[] nums , int target ,boolean findstartindex ){
        int ans = -1; //potential ans
        int start =0;
        int end = nums.length - 1;
        while(start <= end){
            //int mid = start + end /2;//migth be possible that  the value of (start+end)exceed the limit rang of interger
            //better way to find mid
            int mid = start + (end - start) /2;

            if(target<nums[mid]){
                end = mid -1;
            }else if (target>nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                //If we're searching for the first occurrence (findStartIndex is true), we update the end index to mid - 1 to continue searching in the left half of the range.
                //If we're searching for the last occurrence (findStartIndex is false), we update the start index to mid + 1 to continue searching in the right half of the range.
                if(findstartindex ){
                    end = mid - 1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans ;
    }
}
