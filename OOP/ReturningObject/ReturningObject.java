package ReturningObject;

class Box2 {
	int length, breadth,height;
	
	Box2(int l,int b,int h){
		length = l;
		breadth = b;
		height = h;
	}
	Box2 doubleBox() {  // return type of this method is object  
		Box2 temp = new Box2(2*length,2*breadth,2*height);  // memory is allocated and the dimensions are doubled and saved in temp.
		return temp;  // returning object
	}
}

public class ReturningObject {

	public static void main(String[] args) {
		Box2 b1 = new Box2(5,6,7);
		
		Box2 b2 = b1.doubleBox();  // call the doubleBox method to create a new Box2 object b2 with dimensions doubled
		System.out.println("length of b2:" +b2.length);
	}

}
