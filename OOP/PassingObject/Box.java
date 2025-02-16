package PassingObject;
/***************** Passing Object as Argument/Parameter to Method & Constructor********************/
public class Box {
	int length, breadth,height;
	
	Box(int l,int b,int h){
		length = l;
		breadth = b;
		height = h;
	}
	
	Box(Box b){  // Copy Constructor , constructor taking object as parameter
		length = b.length;   // b.length denotes the length of the object which we used as parameter
		breadth = b.breadth;
		height = b.height;
	}
	
	int volume() {
		int vol = length * breadth * height;
		return vol;
	}
	
	Boolean isEqual(Box b) {  // method taking object as parameter
		if(length == b.length && breadth == b.breadth && height == b.height) {  // b.length denotes the length of the object which we used as parameter
			return true;                                                       // length denotes the length of the object which we used to invoke the method
		}
		else return false;
	}
	
	public static void main(String[] args) {
		Box blackBox = new Box(10,20,8);
		int bvol = blackBox.volume();
		System.out.println("blackBox volume : " + bvol);
		
		Box whiteBox = new Box(blackBox);   // Passing object as parameter to Constructor
		int wvol = whiteBox.volume();
		System.out.println("greyBox volume : " + wvol);
		
		Box greyBox = new Box(10,20,30);
		int gvol = greyBox.volume();
		System.out.println("greyBox volume : " + gvol);
		
		System.out.println("Is blackBox and greyBox are equal dim?:" + blackBox.isEqual(greyBox));  // Passing object as parameter to method
		System.out.println("Is blackBox and whiteBox are equal dim?:" + blackBox.isEqual(whiteBox));  //blackBox is the invoking object, whiteBox in argument object
		
		
	}

}
