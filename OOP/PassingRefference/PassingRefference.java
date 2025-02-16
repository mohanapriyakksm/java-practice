package PassingRefference;
class Box1 {
	int length, breadth,height;
	
	Box1(int l,int b,int h){
		length = l;
		breadth = b;
		height = h;
	}
	
	Boolean isEqual(Box1 b) {  
		b.length++;  // as it received the reference, the value of the instance is incremented.
		if(length == b.length && breadth == b.breadth && height == b.height) {
			return true;
		}
		else return false;
	}
}
public class PassingRefference {
	
	static void increment(int a) {  // this method creates a separate stack memory and store the value
		a++;  // the variable stored in this stack memory will be incremented, Not the one in main memory
	}

	public static void main(String[] args) {  // the main method have a separate stack memory
		int a = 100;  // local variable
		increment(a);  // a copy of variable is passed
		System.out.println("value of a :" + a);
		
		Box1 blackBox = new Box1(10,20,8);  // when we create an object using new(), memory is allocated in the heap memory
		Box1 greyBox = new Box1(10,20,8);  // when we create an object, the constructor is called, memory is allocated, 
		                                  // and that memory's reference will be stored in the object.
		
		System.out.println("Is blackBox and greyBox are equal dim?:" + blackBox.isEqual(greyBox)); // when we pass the object as parameter, the reference is passed
		System.out.println("length of greyBox: " + greyBox.length);
		

	}

}
