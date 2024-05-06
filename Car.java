public class Car extends Vehicle {
	private int numberOfSeats;
    private String color;

    public Car(String make, String model, int year, int numberOfSeats, String color) {
        super(make, model, year);
        this.numberOfSeats = numberOfSeats;
        this.color = color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }

	@Override
	public String toString() {
		return "Car [numberOfSeats=" + numberOfSeats + ", color=" + color + "]";
	}
    
}
