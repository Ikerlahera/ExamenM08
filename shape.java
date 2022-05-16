// A sample class Shape which provides a method to get the Shape's area
/**
 * @author Iker Lahera Gonzalez
 * Version 1 */ 
public class shape {
  
  /** 
   * @return double
   */
  public double getArea() {
    return 0;
  }
}
// A Rectangle is a Shape with a specific width and height
class Rectangle extends shape {   // extended form the Shape class
  private double width;
  private double height;
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  public double getArea() {
    return width * height; 
  }
}

class Cuadrat extends shape{
  private double costat;
  public Cuadrat(double costat){
    this.costat = costat;
  }
  public double getArea(){
    return costat*4;
  }
}

// A Circle is a Shape with a specific radius
class Circle extends shape {
  private double radius;
  public Circle(double radius) {
    this.radius = radius; 
  }
  public double getArea() {
    return 3.14 * radius * radius; 
  }
}
