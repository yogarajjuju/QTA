public class RevArray {
    public static void main(String[] args) {
        int arrr[] = {1, 2, 3, 4, 5};
        for(int i=arrr.length-1;i>=0;i--){
            System.out.print(arrr[i]+" ");
        }
        int arr[] = {1, 2, 3, 4, 5};
        int start=0;
        int end= arr.length-1;
        while (start<end){
            int temp=arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }
    }
}
