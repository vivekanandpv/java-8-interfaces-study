package in.athenaeum;

//  As such this annotation is optional
//  But, it is a good measure (just in case be break the rule)
//  Also, it makes out intent clear
@FunctionalInterface
public interface Vehicle {
    void drive();   //  one and only one abstract method

    //  there can be several default or static methods
    default void honk() {
        System.out.println("Default: honk...");
    };

    //  cannot be overridden by the implementing classes
    //  should be accessed from interface
    static void printOwnerName() {
        System.out.println("Default: No information");
    }
}
