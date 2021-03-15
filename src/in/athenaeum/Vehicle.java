package in.athenaeum;

public interface Vehicle {
    void drive();

    default void honk() {
        System.out.println("Default: honk...");
    };

    default void printOwnerName() {
        System.out.println("Default: No information");
    }
}
