package com.torryharris.model;

public class Cars {
        private String name;
        private String fuel_type;
        private int engine_capacity;
        private float power;
        private int no_gears;
        private CarsTyre tyre;
        private CarsMusicSystem ms;

    public Cars() {

    }

    public Cars(String name, String fuel_type, int engine_capacity, float power, int no_gears, CarsTyre tyre, CarsMusicSystem ms) {
            this.name = name;
            this.fuel_type = fuel_type;
            this.engine_capacity = engine_capacity;
            this.power = power;
            this.no_gears = no_gears;
            this.tyre=tyre;
            this.ms=ms;
        }

        public String getName() { return name; }

        public String getFuel_type() { return fuel_type; }

        public int getEngine_capacity() { return engine_capacity; }

        public float getPower() { return power; }

        public int getNo_gears() { return no_gears; }

        public void setName(String name) { this.name = name; }

        public void setFuel_type(String fuel_type) { this.fuel_type = fuel_type; }

        public void setEngine_capacity(int engine_capacity) { this.engine_capacity = engine_capacity; }

        public void setPower(float power) { this.power = power; }

        public void setNo_gears(int no_gears) { this.no_gears = no_gears; }
        public void acceleration()
        {
            System.out.println(name+" is Accelerating");
        }
        public void applyBreak()
        {
            System.out.println(name+" is Slowing / Stopping");
        }
        public void changeGear(int g)
        {
            if(g<=no_gears) {
                System.out.println(name + " is changing to " + g + " Gear");
            }
            else{
                System.out.println("This "+name+" has only "+no_gears+" Gears");
            }
        }
        public void steer()
        {
            System.out.println(name+" is changing directions");
        }
        public void displayFeatures()
        {
            System.out.println("\nFeatures of "+name+" Car:");
            System.out.println("------------------------------");
            System.out.println("Engine Capacity: "+engine_capacity);
            System.out.println("Engine Power: "+power+"bhp");
            System.out.println("Fuel Type: "+fuel_type);
            System.out.println("No of Gears: "+no_gears);
            System.out.println("Tyre Name: "+tyre.getTyreName()+" : Tyre Size: "+tyre.getTyreSize()+" inches");
            System.out.println("Music System Name: "+ms.getMusicSystemName());
            System.out.println("LCD Screen Size: "+ms.getLcdScreenSize());
            System.out.println("No of Speakers: "+ms.getNoOfSpeakers());
            System.out.println("Subwoofers: "+ ms.isSubWoofer());

        }
        /* public void displayFeatures(String featureName)
        {
            if(featureName.equals("Tyre"))
            {
                System.out.println("Tyre Name: "+tyre.getTyreName()+", Tyre Size: "+tyre.getTyreSize()+"inch");
            }
        }
       public void displayFeatures(String featureName)
       {
        if(featureName.equals("MusicSystem"))
        {
            System.out.println("Music System Name: "+ms.getMusicSystemName());
            System.out.println("LCD Screen Size: "+ms.getLcdScreenSize());
            System.out.println("No of Speakers: "+ms.getNoOfSpeakers());
            System.out.println("Subwoofers: "+ ms.isSubWoofer());
        }
       }*/

}
