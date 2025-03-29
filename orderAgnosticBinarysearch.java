// order agnostic means when the array is sorted in asscending oredr
// lets consider an array [90 , 75 , 18 , 12 , 6 , 4 , 3 , 1]
//target elemnet = 75
/* if (target > midd ) then  it will check in LHS of array for that end = m-1
target < mid then it will search on the RHS of an array for that start = mid +1
                TO CHECK THE ORDER OF ARRAY (
                IF(start > end ){
                increasing }
                else decreasing ;
 */
public class orderAgnosticBinarysearch {
    public static void main(String[] args) {
        int[] arr = {90 , 75 , 18 , 12 , 6 , 4 , 3 , 1};
        int target = 12;
        int ans = binarysearch( arr , target);
        System.out.println(ans);

    }
    static int binarysearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        // find order of array
        boolean isAsc;
        if (arr[start] < arr[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }
        while(start <= end){
            //int mid = start + end /2;//migth be possible that  the value of (start+end)exceed the limit rang of interger
            //better way to find mid
            int mid = start + (end - start) /2;

            if (arr[mid] == target){
                return mid ;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid -1;
                }else if (target< arr[mid]){
                    start = mid+1;
                }
            }

            if(target<arr[mid]){
                end = mid -1;
            }else if (target>arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
