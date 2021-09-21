public class Box {
    private int length;
    private int width;
    private int height;
    public Box()
    {
        System.out.println("Inside Box Constructor");
    }
    public void initialize(int l, int w, int h)
    {
        length=l;
        width=w;
        height=h;
    }
    public void display()
    {
        System.out.println("Length="+length);
        System.out.println("Width="+width);
        System.out.println("Height="+height);
    }
    public int getVolume()
    {
        return length*width*height;
    }
}
