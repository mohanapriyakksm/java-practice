public class n5triangle {

    public static float areaOfTriangle (float b1, float h1, float b2, float h2){
     float t1a = (b1*h1)/2;
     float t2a = (b2*h2)/2;
        if(t1a>t2a){
            return t1a;
        }
        return t2a;
    }
    public static void main(String[] args) {
     float b1 = 5;
     float h1=8;
     float b2 =4;
     float h2=11;
     float r = areaOfTriangle(b1, h1, b2, h2);
    System.out.println(r);
        
    }
}
