public class Amstrong {
    public static void main(String[] args) {
        int n=1634;
        int sum =0;
        int original =n;
        int temp =n;
        int count =0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        while(n!=0){
            int digit = n%10;
            sum+=(int)Math.pow(digit,count);
            n/=10;
        }
        if(sum == original) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }
    }

}
