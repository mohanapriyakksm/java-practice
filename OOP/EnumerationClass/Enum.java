package EnumerationClass;
// ENumerations used when you have a fixed set of related constants that won't change during the execution of your program.
enum Level{
    BEGGINNER("B"),INTERMEDIATE("I"),ADVANCED("A");

    private String abbr;
    Level(String ab){
        abbr = ab;
    }
    public String getAbbr(){
        return abbr;
    }

}
public class Enum {
    public static void main(String[] args) {
        Level l1 = Level.ADVANCED;
        Level l2 =Level.BEGGINNER;
        System.out.println(l1.getAbbr());
        System.out.println(l2.ordinal());

    }
    
}
