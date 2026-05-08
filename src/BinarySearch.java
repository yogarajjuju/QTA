public class BinarySearch {
    public static void main(String[] args) {
        int arr[] ={1, 2, 4, 7, 9};
        int start =0;
        int end = arr.length-1;
        int target = 7;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            } else if (arr[mid]<target) {
                start=mid+1;

            } else {
                end=mid-1;
            }
        }
    }
}
