public class Car {
    private String name;
    private String fuel_type;
    private int engine_capacity;
    private float power;
    private int no_gears;

    public Car(String name, String fuel_type, int engine_capacity, float power, int no_gears) {
        this.name = name;
        this.fuel_type = fuel_type;
        this.engine_capacity = engine_capacity;
        this.power = power;
        this.no_gears = no_gears;
    }

    public String getName() { return name;}

    public String getFuel_type() {
        return fuel_type;
    }

    public int getEngine_capacity() {
        return engine_capacity;
    }

    public float getPower() {
        return power;
    }

    public int getNo_gears() {
        return no_gears;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public void setEngine_capacity(int engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void setNo_gears(int no_gears) {
        this.no_gears = no_gears;
    }
    public void acceleration()
    {
        System.out.println(name+" is accelerating");
    }
    public void applyBreak()
    {
        System.out.println(name+" is Slowing / Stopping");
    }
    public void changeGear()
    {
        System.out.println(name+" is changing Gear");
    }
    public void steer()
    {
        System.out.println(name+" is changing directions");
    }
    public void displayFeatures()
    {
        System.out.println("Features of "+name+" Car:");
        System.out.println("Engine Capacity: "+engine_capacity);
        System.out.println("Engine Power: "+power+"bhp");
        System.out.println("Fuel Type: "+fuel_type);
        System.out.println("No of Gears: "+no_gears);

    }

}
