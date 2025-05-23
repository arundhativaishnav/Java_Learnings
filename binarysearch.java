public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {-2 , -1 , 4, 6, 8, 22, 34 , 45 , 56 , 67 ,78};
        int target = 346;
        int ans = binarySearch( arr , target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr , int target){
        int start =0;
        int end = arr.length - 1;
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
