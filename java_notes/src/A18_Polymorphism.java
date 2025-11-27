// Polymorphism
public class A18_Polymorphism {

    public static void main(String[] args) {
        Car polyCar = new ElectricCar("BYD", "Seal", 70);
        polyCar.drive(); // same method, different behavior
    }

    static class Car {
        String brand;
        String model;

        Car(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        void drive() {
            System.out.println("Driving a " + brand + " " + model);
        }
    }

    static class ElectricCar extends Car {
        int batteryCapacity;

        ElectricCar(String brand, String model, int batteryCapacity) {
            super(brand, model);
            this.batteryCapacity = batteryCapacity;
        }

        @Override
        void drive() {
            System.out.println("Driving electric " + brand + " " + model + " (" + batteryCapacity + " kWh)");
        }
    }
}
