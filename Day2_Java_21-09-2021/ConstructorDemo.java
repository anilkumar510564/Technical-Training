public class ConstructorDemo {
    public static void main(String[] args) {
        double l,w,h;
        Constructor b1=new Constructor();
        Constructor b2=new Constructor(100,50,200);
        System.out.println("Box values before Increase:");
        b2.display();
        System.out.println("Box Volume:"+b2.getVolume());
        l=b2.getLength();
        w=b2.getWidth();
        h=b2.getHeight();
        l=l+(l*10/100);
        w=w+(w*20/100);
        h=h+(h*8/100);
        b2.setLength(l);
        b2.setWidth(w);
        b2.setHeight(h);
        System.out.println("Box values after Increase:");
        b2.display();
        System.out.println("Box Volume:"+b2.getVolume());

        b1.setLength(b1.getLength()+(b1.getLength()*10/100));

    }
}
