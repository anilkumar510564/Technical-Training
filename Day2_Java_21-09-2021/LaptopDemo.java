public class LaptopDemo {
    public static void main(String[] args) {
        Laptop hp=new Laptop();
        hp.initialize(4,256,"Intel",15.2);
        System.out.println("HP Laptop:");
        hp.display();
        Laptop dell=new Laptop();
        dell.initialize(3,256,"AMD",14.5);
        System.out.println("Dell Laptop:");
        dell.display();
    }
}
