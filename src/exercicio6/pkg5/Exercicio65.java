
package exercicio6.pkg5;

public class Exercicio65 {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle:");
        System.out.println("Parameter: " + circle.getParameter());
        System.out.println("Area: " + circle.getArea());
        System.out.println(circle.toString());
        
        ResizableCircle Rcirc = new ResizableCircle(5);
        Rcirc.resize(50);
        System.out.println(Rcirc.toString());
        System.out.println(Rcirc.getArea());
    }
   
}
