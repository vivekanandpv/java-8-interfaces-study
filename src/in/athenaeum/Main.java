package in.athenaeum;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car("Vikas");
        Vehicle truck = new Truck();

        car.drive();
        truck.drive();

        car.honk();
        truck.honk();

        car.printOwnerName();
        truck.printOwnerName();
    }
}
