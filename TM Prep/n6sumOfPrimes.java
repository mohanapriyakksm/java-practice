public class n6sumOfPrimes {
    public static int sumOfPrimesInrange(int start,int end){
        int result = 0;
        // for +ve s and e
        if(start>=0 && end >=0){
            for(int i=start;i<=end;i++){
                if(isPrime(i)){
                    result += i;
                }
            }
            return result;
        }

        // for -ve s and e
        if(start<0 && end <=0){
            for(int i=start;i>=end;i--){
                if(isPrime(i)){
                    result += i;
                }
            }
            return result;
        }

        // for -ve s and +ve e
        if(start<0 && end >0){
            int i = start;
            while(i!=0){
                if(isPrime(i)){
                    result += i;
                    i--;
                }
                else{i--;}
            }

            for(int j=0;j<=end;j++){
                if(isPrime(j)){
                    result += j;
                }
            }
            return result;
        }
                return result;
        
    }

    public static Boolean isPrime(int num){
        int n = Math.abs(num);
        if(n<2){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int s = -30;
        int e = 56;
        
        int r = sumOfPrimesInrange(s, e);
        System.out.println(r);
    }
}
