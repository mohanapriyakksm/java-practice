package FAQ;

public class gcd_or_hcf {
    static int gcd(int p, int q){
        if(p==0){
            return q;
        }

        if(q==0){
            return p;
        }

        // base case
        if(p==q){
            return p;
        }

        if(p>q){
            return gcd(p-q,q);
        }else{
            return gcd(p,q-p);
        }


    }

    public static void main(String[] args) {
        System.out.println(gcd(16, 8));
    }
}
