package in.athenaeum;

public class Car implements Vehicle {
    private String owner;

    public Car(String owner) {
        this.owner = owner;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }

    @Override
    public void honk() {
        System.out.println("Car: honking....");
    }

    @Override
    public void printOwnerName() {
        System.out.println(this.owner);
    }
}
