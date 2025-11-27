// Inheritance
public class A17_Inheritance {

    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar("Tesla", "Model 3", 85);
        eCar.drive();
        eCar.charge();
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

        void charge() {
            System.out.println("Charging the " + brand + " " + model + "...");
        }
    }
}
