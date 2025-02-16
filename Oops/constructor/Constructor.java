package constructor;

class Box{
    double width, height, depth;
    Box(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }

    Box(){
        width = height = depth = 0;
    }

    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width*height*depth;
    }
}

public class Constructor {
    public static void main(String args[]){
        Box blackBox = new Box(2,3,4);
        System.out.println("Volume of blackBox:"+blackBox.volume());
        Box noBox = new Box();
        System.out.println("Volume of blackBox:"+noBox.volume());
        Box blueBox = new Box(2);
        System.out.println("Volume of blackBox:"+blueBox.volume());
    }
}
