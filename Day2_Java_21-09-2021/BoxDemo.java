public class BoxDemo {
    public static void main(String[] args) {
        Box b1=new Box();
        b1.initialize(10,5,8);
        b1.display();
        System.out.println("Volume of Box1 is:"+b1.getVolume());
        Box b2=new Box();
        b2.initialize(5,4,2);
        b2.display();
        System.out.println("Volume of Box2 is:"+b2.getVolume());
        Box b3=new Box();
        b3.initialize(5,10,4);
        b3.display();
        System.out.println("Volume of Box3 is:"+b3.getVolume());

    }
}
