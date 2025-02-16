public class PerfectNumber {
    public static void main(String[] args) {
        int num = 6;
        int sum = 0;
        int count = 0;

        for(int i=1;i<num;i++){
            if(num%i == 0){
                sum += i;
                count++;
            }
        }
        if(sum==num){
            System.out.println("Perfect Number");
            System.out.println("No. of divisors:"+count);
        }
        else{ System.out.println("Not a Perfect NUmber");}
    }
}
