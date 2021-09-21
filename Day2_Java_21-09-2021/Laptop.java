public class Laptop {
    private int ram;
    private int hdd;
    private String processor;
    private double screen_size;
    public void initialize(int r, int h, String p, double s)
    {
        ram=r;
        hdd=h;
        processor=p;
        screen_size=s;
    }
    public void display()
    {
        System.out.println("Ram: "+ram+"GB");
        System.out.println("HDD: "+hdd+"GB");
        System.out.println("Processor: "+processor);
        System.out.println("Screen Size: "+screen_size);
    }

}
