package in.athenaeum;

public interface Vehicle {
    void drive();

    default void honk() {
        System.out.println("Default: honk...");
    };

    //  cannot be overridden by the implementing classes
    //  should be accessed from interface
    static void printOwnerName() {
        System.out.println("Default: No information");
    }
}
