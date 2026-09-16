public class Demo {
    public static void main(String[] args) {

        Circle c = new Circle();

        c.setRadius(5);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());

        c.setRadius(-5);

        System.out.println("After setting radius to -5:");
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}