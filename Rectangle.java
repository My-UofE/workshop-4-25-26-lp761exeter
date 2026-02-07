// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  // second constructor: 
  public Rectangle() {
      this(1,1,0,0);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  public void scale(double x, double y)
  {
    width*=x;
    height*=y;
  }
  
  public void scale(double x)
  {
    width*=x;
    height*=x;
  }

  public double calcRatio()
  {
    return width/height;
  }

  public boolean isSquare()
  {
    double epsilon = 0.001;
    return width-height<epsilon;
  }

  // getters
  public double getWidth()
  { 
    return width;
  }

  public double getHeight()
  { 
    return height;
  }

  public double getOriginX()
  { 
    return originX;
  }

  public double getOriginY()
  { 
    return originY;
  }

  // setters
  public void setWidth(double w)
  {
    if (w>-1)
    {
      width = w;
    }
  }

  public void setHeight(double h)
  {
    if (h>-1)
    {
      height = h;
    }
  }
}
