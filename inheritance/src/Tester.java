
public class Tester {

	public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2020);
        
        // Accessing and modifying attributes of Vehicle
        System.out.println("Vehicle Make: " + vehicle.getMake());
        System.out.println("Vehicle Model: " + vehicle.getModel());
        System.out.println("Vehicle Year: " + vehicle.getYear());
        vehicle.setYear(2022);
        System.out.println("Updated Vehicle Year: " + vehicle.getYear());

        // Testing methods of Vehicle
        vehicle.accelerate();
        vehicle.brake();
        
        System.out.println("-----------------------------------");

        // Creating a Car object
        Car car = new Car("Honda", "Civic", 2019, 5, "Red");
        
        // Accessing and modifying attributes of Car
        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());
        System.out.println("Car Number of Seats: " + car.getNumberOfSeats());
        System.out.println("Car Color: " + car.getColor());
        car.setColor("Blue");
        System.out.println("Updated Car Color: " + car.getColor());

        // Testing methods of Car
        car.accelerate();
        car.brake();
    }

}
