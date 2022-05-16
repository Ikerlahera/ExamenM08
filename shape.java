// A sample class Shape which provides a method to get the Shape's area
class Shape {
  public double getArea() {
    return 0;
  }
}
// A Rectangle is a Shape with a specific width and height
class Rectangle extends Shape {   // extended form the Shape class
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
// A Circle is a Shape with aa specific radius
class Circle extends Shape {
  private double radius;
  public Circle(double radius) {
    this.radius = radius; 
  }
  public double getArea() {
    return 3.14 * radius * radius; 
  }
}
