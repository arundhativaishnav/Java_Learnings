public class infinitarray {
    public static void main(String[] args) {
        int[] arr = { 3,4,5,6,8,56,67, 89 , 100 , 170 , 180};
        int target = 100;
        System.out.println(findingRange(arr , target));


    }
    // start with the box of size 2
    static int findingRange(int[] arr , int target){
        //first find the range .first start with box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to be present the range
        while(target > arr[end]){
            int newstart = end +1;// newstart is like temp
            //double the box value
            //end = previous end +sizeofbox *2
            // adding 1 bcoz array starts from the index 0
            end = Math.min(end + (end - start + 1) * 2, arr.length - 1);
            start = newstart;
        }
        return binarySearch(arr , target ,start , end  );
    }

    static int binarySearch(int[] arr , int target , int start , int end ){

        while(start <= end){
            //int mid = start + end /2;//migth be possible that  the value of (start+end)exceed the limit rang of interger
            //better way to find mid
            int mid = start + (end - start) /2;

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
