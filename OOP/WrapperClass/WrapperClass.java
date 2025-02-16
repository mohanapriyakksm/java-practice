package WrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        int i = 6; // Primitive Data Type
        System.out.println(i);

        Integer i2 = Integer.valueOf(8); //Boxing,Wrapping
        int j = i2.intValue(); //Unboxing
        System.out.println(j);

        Integer i3 = 7; // AutoBoxing  --> Integer.valueOf(7)
        int k = i3; // AutoUnboxing  --> i3.intValue()
        System.out.println(k);

        String s = "123";
        int y = Integer.parseInt(s);
        System.out.println(y);


    }
    
}
