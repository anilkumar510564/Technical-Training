public class Constructor {
    private double length;
    private double width;
    private double height;
    public Constructor()
    {
        System.out.println("Inside Default Constructor");
    }
    public Constructor(double length, double width, double height)
    {
        System.out.println("Inside Parameterized Constructor");
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public void display()
    {
        System.out.println("Length="+length);
        System.out.println("Width="+width);
        System.out.println("Height="+height);
    }
    public double getVolume()
    {
        return length*width*height;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
}
