package FAQ;

public class perfectNum {
    static void perfectnum(int num){
        //find all the proper divisors -> start from 1
        int i = 1;
        int sum = 0;
        while(i<num){
            if(num%i == 0){
                sum = sum + i;
            }
            i++;
        }

        if(sum == num){
            System.out.println("Perfect number!");
        }else{
            System.out.println("Not a perfect number!");
        }


    }

    public static void main(String[] args) {
        perfectnum(6);
    }
    
}
