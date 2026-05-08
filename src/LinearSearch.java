public class LinearSearch {
    public static void main(String[] args) {
        int arr[] ={4, 7, 1, 9, 2};
        int target =9;
        boolean found =false;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                found=true;
                break;
            }
        }
        System.out.println(found);
    }
}
