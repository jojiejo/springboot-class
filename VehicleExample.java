class Vehicle {
    protected String name;
    protected boolean withEngine;

    public Vehicle(String name, boolean withEngine){
        this.name = name;
        this.withEngine = withEngine;
    }

    public void identifyMyself(){
        System.out.println("Hi I'm parent of all vehicles, my name is " + name + ", my engine status is " + parseWithEngine());
    }

    public String parseWithEngine(){
        String engineStatus = withEngine? "with engine" : "no engine";
        return engineStatus;
    }
}

class Bike extends Vehicle {
    private int wheelCount;

    public Bike(String name, boolean withEngine, int wheelCount){
        super(name, withEngine);
        this.wheelCount = wheelCount;
    }

    public void identifyMyself(){
        System.out.println("Hi I'm Bike, my name is " + name + 
        ", my engine status is " + parseWithEngine() + 
        ", i have " + wheelCount + " wheel(s)");
    }
}

class Car extends Vehicle {
    private int wheelCount;
    private String engineType;

    public Car(String name, boolean withEngine, int wheelCount, String engineType){
        super(name, withEngine);
        this.wheelCount = wheelCount;
        this.engineType = engineType;
    }

    public void identifyMyself(){
        System.out.println("Hi I'm Bike, my name is " + name + 
            ", my engine status is " + parseWithEngine() + 
            ", i have " + wheelCount + 
            " wheel(s), my engine type is " + engineType);
    }
}

class Bus extends Vehicle {
    private int wheelCount;
    private boolean isPrivateBus;

    public Bus(String name, boolean withEngine, int wheelCount, boolean isPrivateBus){
        super(name, withEngine);
        this.wheelCount = wheelCount;
        this.isPrivateBus = isPrivateBus;
    }

    public void identifyMyself(){
        System.out.println("Hi I'm Bus " + parseIsPrivateBus() + 
            ", my name is " + name + 
            ", my engine status is " + parseWithEngine() + 
            ", i have " + wheelCount + " wheel(s)");
    }

    public String parseIsPrivateBus(){
        String privateBus = isPrivateBus? "[Private Bus]" : "[Public Bus]";
        return privateBus;
    }
}

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle objVehicle = new Vehicle("Gerobak", false);
        objVehicle.identifyMyself();

        System.out.println();

        Bike objPedalBike = new Bike("Pedal Bikes", false, 2);
        objPedalBike.identifyMyself();

        Bike objMotorBike = new Bike("Motor Bikes", true, 2);
        objMotorBike.identifyMyself();

        System.out.println();
        
        Car objSportCar = new Car("Sport Cars", true, 4, "V8");
        objSportCar.identifyMyself();

        Car objPickupCar = new Car("Pickup Cars", true, 4, "Solar");
        objPickupCar.identifyMyself();

        System.out.println();

        Bus objTransJakarta = new Bus("Trans Jakarta", true, 4, true);
        objTransJakarta.identifyMyself();

        Bus objSchoolBus = new Bus("School Bus", true, 4, false);
        objSchoolBus.identifyMyself();
    }
}
